package com.zerobase.api.loan.review

import com.zerobase.domain.repository.LoanReviewRepository
import org.springframework.stereotype.Service

@Service
class LoanReviewServiceImpl(
        private val loanReviewRepository: LoanReviewRepository
): LoanReviewService {
    override fun loanReviewMain(userKey: String): LoanReviewDto.LoanReviewReponseDto {
        val loanResult = getLoanResult(userKey)

        return LoanReviewDto.LoanReviewReponseDto(
                userKey = userKey,
                loanResult = LoanReviewDto.LoanResult(
                        loanResult.userLimitAmount,
                        loanResult.userLoanInterest
                )
        )
    }

    override fun getLoanResult(userKey: String): LoanReviewDto.LoanReview {
        var loanReview = loanReviewRepository.findByUserKey(userKey)

        return LoanReviewDto.LoanReview(
                loanReview.userKey,
                loanReview.loanLimitAmount,
                loanReview.loanInterest
        )
    }

}