package com.zerobase.css.dto

class LoanRequestDto {
    data class RequestInputDto(
            val userKey: String,
            var userName: String,
            var userIncomeAmount: Long,
            var userRegistrationNumber: String
    )
}