package com.zerobase.api.loan.request

class LoanRequestDto {
    data class LoanRequestInputDto(
            var userName: String,
            var userIncomeAmount: Long,
            var userRegistrationNumber: String
    ) {
        fun toUserInfoDto(userKey: String) =
                UserInfoDto(
                        userKey, userName, userRegistrationNumber, userIncomeAmount
                )
    }

    data class LoanRequestResponseDto(
            var userKey: String
    )
}