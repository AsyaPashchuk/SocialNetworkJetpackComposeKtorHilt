package com.socialnetworkjetpackcomposektorhilt.presentation.components

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.socialnetworkjetpackcomposektorhilt.presentation.MainActivity
import com.socialnetworkjetpackcomposektorhilt.presentation.util.TestTags
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StandardTextFieldKtTest {

//    @get:Rule
//    val composeTestRule = createAndroidComposeRule<MainActivity>()
//
//    @Test
//    fun enterToLongString_maxLengthNotExceeded() {
//        composeTestRule.setContent {
//            var text by remember {
//                mutableStateOf("")
//            }
//            MaterialTheme {
//                StandardTextField(
//                    text = text,
//                    onValueChange = {
//                        text = it
//                    },
//                    maxLength = 5,
//                    modifier = Modifier.semantics {
//                        testTag = TestTags.STANDARD_TEXT_FIELD
//                    }
//                )
//            }
//        }
//
//        val expectedString = "abcde"
//        composeTestRule
//            .onNodeWithTag(TestTags.STANDARD_TEXT_FIELD)
//            .performTextClearance()
//        composeTestRule
//            .onNodeWithTag(TestTags.STANDARD_TEXT_FIELD)
//            .performTextInput(expectedString)
//        composeTestRule
//            .onNodeWithTag(TestTags.STANDARD_TEXT_FIELD)
//            .performTextInput("f")
//        composeTestRule
//            .onNodeWithTag(TestTags.STANDARD_TEXT_FIELD)
//            .assertTextEquals(expectedString)
//    }
//
//    @Test
//    fun enterPassword_toggleVisibility_passwordVisible() {
//        composeTestRule.setContent {
//            var text by remember {
//                mutableStateOf("")
//            }
//            MaterialTheme {
//                StandardTextField(
//                    text = text,
//                    onValueChange = {
//                        text = it
//                    },
//                    maxLength = 5,
//                    modifier = Modifier.semantics {
//                        testTag = TestTags.PASSWORD_TOGGLE
//                    }
//                )
//            }
//            composeTestRule
//                .onNodeWithTag(TestTags.STANDARD_TEXT_FIELD)
//                .performTextInput("abcde")
//            composeTestRule
//                .onNodeWithTag(TestTags.PASSWORD_TOGGLE)
//        }
//    }
}