package com.learn.componentscompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.learn.componentscompose.R

@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.image_local),
        contentDescription = "imagen simple",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun CircleImageView() {
    Image(
        painter = painterResource(R.drawable.image_local),
        contentDescription = "Circle Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(128.dp)
            .clip(CircleShape) // clip to the circle shape
            .border(5.dp, Color.Gray, CircleShape)//optional
    )
}

@Composable
fun ImageNetworkBasic() {
    AsyncImage(
        model = "https://loremflickr.com/600/600/cat?lock=1",
        contentDescription = null,
    )
}

@Composable
fun ImageNetworkPlaceHolder() {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThi40vt18N5OlaogdyWSKwc5126UBI1GDsBA&usqp=CAU")
            .crossfade(true)
            .error(R.drawable.error_message)
            .build(),
        placeholder = painterResource(R.drawable.placeholder),
        contentDescription = stringResource(R.string.description),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(CircleShape)
            .size(250.dp)
    )
}

@Composable
fun ImageNetworkPlaceHolderWithError() {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data("https://jsonplaceholder.typicode.com/guide/")
            .crossfade(true)
            .error(R.drawable.error_message)
            .build(),
        placeholder = painterResource(R.drawable.placeholder),
        contentDescription = stringResource(R.string.description),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(CircleShape)
            .size(250.dp)
    )
}
