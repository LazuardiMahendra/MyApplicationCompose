package com.example.mycomposeaplication.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.mycomposeaplication.R
import com.example.mycomposeaplication.model.BottomBarItem


@Composable
fun CustomBottomBar(modifier: Modifier = Modifier) {

    NavigationBar(containerColor = MaterialTheme.colorScheme.background, modifier = modifier) {
        val navigationItems = listOf(
            BottomBarItem(
                title = stringResource(R.string.home), icon = Icons.Default.Home
            ),

            BottomBarItem(
                title = stringResource(R.string.favorite), icon = Icons.Default.Favorite
            ),
        )

        navigationItems.map {
            NavigationBarItem(
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                label = { Text(it.title) },
                selected = it.title == navigationItems[0].title,
                onClick = {})
        }
    }
}


