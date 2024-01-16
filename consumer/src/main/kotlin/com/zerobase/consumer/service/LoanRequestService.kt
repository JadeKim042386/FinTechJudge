package com.zerobase.consumer.service

import com.zerobase.domain.domain.LoanReview
import com.zerobase.domain.repository.LoanReviewRepository
import org.springframework.stereotype.Service

@Service
class LoanRequestService(
        private val loanReviewRepository: LoanReviewRepository
) {
    fun loanRequest() {
        //TODO
    }

    fun loanRequestToDb() {
        //TODO
    }

    fun saveLoanReviewData(loanReview: LoanReview) = loanReviewRepository.save(loanReview)
}