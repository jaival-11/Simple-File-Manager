package app.morphe.standalone.ui.screen.shared

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

val LocalDialogTextColor = compositionLocalOf { Color.Black }
val LocalDialogSecondaryTextColor = compositionLocalOf { Color.Gray }

@Composable
fun MorpheDialog(
    onDismissRequest: () -> Unit,
    title: String? = null,
    noPadding: Boolean = false,
    scrollable: Boolean = false,
    footer: (@Composable () -> Unit)? = null,
    content: @Composable () -> Unit
) {
    // Removed the Dialog wrapper and added Modifier.fillMaxSize()
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        CompositionLocalProvider(
            LocalDialogTextColor provides MaterialTheme.colorScheme.onBackground,
            LocalDialogSecondaryTextColor provides MaterialTheme.colorScheme.onSurfaceVariant
        ) {
            content()
        }
    }
}

@Composable
fun MorpheDialogButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    Button(onClick = onClick, enabled = enabled, modifier = modifier) {
        Text(text)
    }
}

@Composable
fun MorpheDialogOutlinedButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    OutlinedButton(onClick = onClick, enabled = enabled, modifier = modifier) {
        Text(text)
    }
}
