package com.zerobase.api.loan.review

import com.zerobase.api.loan.request.LoanRequestController
import com.zerobase.domain.domain.LoanReview
import com.zerobase.domain.repository.LoanReviewRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@WebMvcTest(LoanReviewController::class)
class LoanReviewControllerTest {
    private lateinit var mvc: MockMvc
    private lateinit var loanReviewController: LoanReviewController
    private var loanReviewRepository: LoanReviewRepository = mockk()
    @MockBean
    private lateinit var loanReviewServiceImpl: LoanReviewServiceImpl

    companion object {
        private const val baseUrl = "/fintech/api/v1"
    }

    @BeforeEach
    fun init() {
        loanReviewServiceImpl = LoanReviewServiceImpl(loanReviewRepository)
        loanReviewController = LoanReviewController(loanReviewServiceImpl)
        mvc = MockMvcBuilders.standaloneSetup(loanReviewController).build()
    }

    @Test
    @DisplayName("유저 요청이 들어오면 정상 응답")
    fun testNormalCase() {
        //given
        var userkey = "13bkbkb23k4b"
        every { loanReviewRepository.findByUserKey(any()) } returns LoanReview(userkey, 1, 1.0)
        //when
        mvc.get("$baseUrl/review/$userkey")
                .andExpect {
                    status { isOk() }
                }
        //then
    }
}