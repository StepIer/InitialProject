package com.stepler.samplefeature.presentation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import org.orbitmvi.orbit.compose.collectAsState
import org.orbitmvi.orbit.compose.collectSideEffect

@Composable
fun MainScreen() {

    val viewModel: MainViewModel = hiltViewModel()
    val state = viewModel.collectAsState()

    viewModel.collectSideEffect { sideEffect ->

    }

    Text(text = state.value.text)
}