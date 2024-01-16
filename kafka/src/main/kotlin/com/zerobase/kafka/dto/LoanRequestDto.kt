package com.zerobase.kafka.dto

data class LoanRequestDto(
        val userKey: String,
        var userName: String,
        var userIncomeAmount: Long,
        var userRegistrationNumber: String
)
