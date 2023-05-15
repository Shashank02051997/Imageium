# Imageium
![Github Followers](https://img.shields.io/github/followers/Shashank02051997?label=Follow&style=social)
![GitHub stars](https://img.shields.io/github/stars/Shashank02051997/Imageium?style=social)
![GitHub forks](https://img.shields.io/github/forks/Shashank02051997/Imageium?style=social)
![GitHub watchers](https://img.shields.io/github/watchers/Shashank02051997/Imageium?style=social)
![Twitter Follow](https://img.shields.io/twitter/follow/shashank020597?label=Follow&style=social)

![GitHub pull requests](https://img.shields.io/github/issues-pr/Shashank02051997/Imageium) ![GitHub closed pull requests](https://img.shields.io/github/issues-pr-closed/Shashank02051997/Imageium) ![GitHub last commit](https://img.shields.io/github/last-commit/Shashank02051997/Imageium)  ![GitHub issues](https://img.shields.io/github/issues-raw/Shashank02051997/Imageium) [![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](Shashank02051997/Imageium)

[![GitHub license](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=23)
<br>
<a href="https://www.linkedin.com/in/shashank-singhal-a87729b5/">
    <img src="https://img.shields.io/badge/Support-Recommed%2FEndorse%20me%20on%20Linkedin-yellow?style=for-the-badge&logo=linkedin" alt="Recommend me on LinkedIn" /></a>

Imageium is a sample image blog Android application 📱 built to demonstrate the use of Modern Android development tools - (Kotlin, Coroutines, Flow, Dagger 2/Hilt, Architecture Components, MVVM, Room, Retrofit, Moshi, Material Components).

***You can Install and test latest app from below 👇***

[![Imageium App](https://img.shields.io/badge/Imageium-APK-red.svg?style=for-the-badge&logo=android)](https://github.com/Shashank02051997/Imageium/tree/main/apk)

## Screenshots

**Please click the image below to enlarge.**

<img src="https://github.com/Shashank02051997/Imageium/assets/20399094/04202497-eb90-441f-8bea-937759ddc5a6" height="600" width="300" h
space="40"><img src="https://github.com/Shashank02051997/Imageium/assets/20399094/a3c49c1a-05d6-400f-bd13-95f11e410b03" height="600" width="300" hspace="40">

<img src="https://github.com/Shashank02051997/Imageium/assets/20399094/94f324b5-a75f-4484-b401-f2fb4f5df4b8" height="600" width="300" hspace="40"><img src="https://github.com/Shashank02051997/Imageium/assets/20399094/9ffe29b2-39a9-4f57-99a4-dfa0e64d00bb" height="600" width="300" hspace="40">

## Prerequisites 📝
- IntelliJ IDEA (any edition) or Android Studio(IDE) to run this project

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Moshi](https://github.com/square/moshi) - A modern JSON library for Kotlin and Java.
- [Moshi Converter](https://github.com/square/retrofit/tree/master/retrofit-converters/moshi) - A Converter which uses Moshi for serialization to and from JSON.
- [Coil-kt](https://coil-kt.github.io/coil/) - An image loading library for Android backed by Kotlin Coroutines.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.


# Package Structure
    
    com.shashank.imageium    # Root Package
    .
    ├── data                # For data handling.
    │   ├── local           # Local Persistence Database. Room (SQLite) database
    |   │   ├── dao         # Data Access Object for Room   
    │   ├── remote          # Remote Data Handlers     
    |   │   ├── api         # Retrofit API for remote end point.
    │   └── repository      # Single source of data.
    |
    ├── model               # Model classes
    |
    ├── di                  # Dependency Injection             
    │   ├── builder         # Activity Builder
    │   ├── component       # DI Components       
    │   └── module          # DI Modules
    |
    ├── ui                  # Activity/View layer
    │   ├── base            # Base View
    │   ├── main            # Main Screen Activity & ViewModel
    |   │   ├── adapter     # Adapter for RecyclerView
    |   │   └── viewmodel   # ViewHolder for RecyclerView   
    │   └── details         # Detail Screen Activity and ViewModel
    |
    └── utils               # Utility Classes / Kotlin extensions


## Architecture
This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.

![](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/Shashank02051997/Imageium/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friend
- [Twitter](https://twitter.com/shashank020597)
- [Github](https://github.com/Shashank02051997)
- [Linkedin](https://www.linkedin.com/in/shashank-singhal-a87729b5/)
- [Facebook](https://www.facebook.com/shashanksinghal02)

<p>
Don't forget to star ⭐ the repo it motivates me to share more open source
</p>

## Donation
If this project help you reduce time to develop, you can give me a cup of coffee :) 

<a href="https://www.buymeacoffee.com/mXUuDW7" target="_blank"><img src="https://bmc-cdn.nyc3.digitaloceanspaces.com/BMC-button-images/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

## 💬 Discuss

Have any questions, doubts or want to present your opinions, views? You're always welcome. You can [start discussions](https://github.com/Shashank02051997/Imageium/discussions).

## License

```
MIT License

Copyright (c) 2021 Shashank Singhal

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```

## Visitors Count

<img align="left" src = "https://profile-counter.glitch.me/Imageium/count.svg" alt ="Loading">

