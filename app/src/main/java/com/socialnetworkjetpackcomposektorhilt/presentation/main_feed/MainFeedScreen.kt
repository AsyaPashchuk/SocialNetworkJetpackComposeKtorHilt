package com.socialnetworkjetpackcomposektorhilt.presentation.main_feed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.socialnetworkjetpackcomposektorhilt.R
import com.socialnetworkjetpackcomposektorhilt.presentation.components.Post
import com.socialnetworkjetpackcomposektorhilt.presentation.components.StandardToolbar
import com.socialnetworkjetpackcomposektorhilt.presentation.util.Screen

@Composable
fun MainFeedScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        StandardToolbar(
            navController = navController,
            title = {
                Text(
                    text = stringResource(id = R.string.your_feed),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )
            },
            modifier = Modifier.fillMaxWidth(),
            showBackArrow = true,
            navActions = {
                IconButton(
                    onClick = {
                        navController.navigate(Screen.SearchScreen.route)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = MaterialTheme.colors.onBackground
                    )
                }
            }
        )
        Post(
            post = com.socialnetworkjetpackcomposektorhilt.domain.models.Post(
                userName = "Someone",
                imageUrl = "",
                profilePictureUrl = "",
                description = "hgoaeruhqga;erg kmierhn'wet f[airhytaq,v[a08rh[gaqe 'a[ehr[gaq'e",
                likeCount = 17,
                commentCount = 7
            ),
            onPostClick = {
                navController.navigate(Screen.PostDetailScreen.route)
            }
        )
    }
}