package com.zerobase.api.loan.review

interface LoanReviewService {
    fun loanReviewMain(userKey: String): LoanReviewDto.LoanReviewReponseDto

    fun getLoanResult(userKey: String): LoanReviewDto.LoanReview
}
