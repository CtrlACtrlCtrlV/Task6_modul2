package com.example.myapplication7

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// ==========================================
// 1. Круг исходного размера в правом верхнем углу
// ==========================================
@Composable
fun Task6Part1() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp) // Размер компонента
            .background(Color.Black)               // Черный фон
    ) {
        Image(
            painter = painterResource(id = R.drawable.circle),
            contentDescription = "Круг",
            modifier = Modifier.align(Alignment.TopEnd) // Выравнивание в правый верхний угол
            // Размер не задаем, чтобы он остался исходным (48x48dp)
        )
    }
}

// ==========================================
// 2. Растянутый круг по центру с изменением цвета
// ==========================================
@Composable
fun Task6Part2() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp) // Размер контейнера
            .background(Color.Blue),               // Синий фон
        contentAlignment = Alignment.Center        // Центрируем
    ) {
        Image(
            painter = painterResource(id = R.drawable.circle),
            contentDescription = "Круг",
            modifier = Modifier.fillMaxSize(),     // Растягиваем на весь контейнер
            // ВОТ ГЛАВНАЯ СТРОКА:
            contentScale = ContentScale.FillBounds, // Принудительно искажает пропорции (растягивает)
            colorFilter = ColorFilter.tint(Color.Magenta) // Фиолетовый/пурпурный цвет
        )
    }
}

// ==========================================
// Превью для проверки
// ==========================================
@Preview(showBackground = true, name = "Part 1 - Black Box")
@Composable
fun PreviewTask6Part1() {
    Task6Part1()
}

@Preview(showBackground = true, name = "Part 2 - Blue Box")
@Composable
fun PreviewTask6Part2() {
    Task6Part2()
}