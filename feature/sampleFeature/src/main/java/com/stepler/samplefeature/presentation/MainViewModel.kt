package com.stepler.samplefeature.presentation

import androidx.lifecycle.ViewModel
import com.stepler.presentation.useCase
import com.stepler.samplefeature.domain.SampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container

@HiltViewModel
class MainViewModel @Inject constructor(
    private val sampleUseCase: SampleUseCase
) : ViewModel(), ContainerHost<MainViewModel.State, MainViewModel.SideEffect> {

    override val container = container<State, SideEffect>(State())

    init {
        intent {
            useCase {
                val text = sampleUseCase.invoke()
                reduce {
                    state.copy(text = text)
                }
            }.onSuccess {

            }.onFailure {

            }
        }
    }

    fun sendAction(action: Action) {
        when(action) {

        }
    }

    object SideEffect
    object Action

    data class State(
        val text: String = ""
    )
}