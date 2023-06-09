package com.socialnetworkjetpackcomposektorhilt.presentation.splash

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.navigation.NavController
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.socialnetworkjetpackcomposektorhilt.MainCoroutineScopeRule
import com.socialnetworkjetpackcomposektorhilt.presentation.MainActivity
import com.socialnetworkjetpackcomposektorhilt.presentation.ui.theme.SocialNetworkJetpackComposeKtorHiltTheme
import com.socialnetworkjetpackcomposektorhilt.presentation.util.Screen
import com.socialnetworkjetpackcomposektorhilt.util.Constants
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class SplashScreenKtTest {

//    @get:Rule
//    val composeTestRule = createAndroidComposeRule<MainActivity>()
//
//    @RelaxedMockK
//    lateinit var navController: NavController
//
//    private val testDispatcher = TestCoroutineDispatcher()
//
//    @Before
//    fun setUp() {
//        MockKAnnotations.init(this)
//    }
//
//    @Test
//    fun splashScreen_displaysAndDisappears() = testDispatcher.runBlockingTest {
//        composeTestRule.setContent {
//            SocialNetworkJetpackComposeKtorHiltTheme {
//                SplashScreen(navController = navController)
//            }
//        }
//        composeTestRule
//            .onNodeWithContentDescription("logo")
//            .assertExists()
//
//        advanceTimeBy(Constants.SPLASH_SCREEN_DURATION)
//
//        verify {
//            navController.popBackStack()
//            navController.navigate(Screen.LoginScreen.route)
//        }
//    }
}