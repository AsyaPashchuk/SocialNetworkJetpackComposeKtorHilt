package com.socialnetworkjetpackcomposektorhilt.presentation.register

data class RegisterState(
    val userNameText: String = "",
    val userNameError: UserNameError? = null,
    val emailText: String = "",
    val emailError: EmailError? = null,
    val passwordText: String = "",
    val passwordError: PasswordError? = null,
    val isPasswordVisible: Boolean = false
) {

    sealed class UserNameError {
        object FieldEmpty: UserNameError()
        object InputTooShort: UserNameError()
    }

    sealed class EmailError {
        object FieldEmpty: EmailError()
        object InvalidEmail: EmailError()
    }

    sealed class PasswordError {
        object FieldEmpty: PasswordError()
        object InputTooShort: PasswordError()
        object InvalidPassword: PasswordError()
    }
}