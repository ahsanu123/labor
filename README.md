<p>
  <a href="">
    <img alt="npm version" src="https://badgen.net/github/commits/ahsanu123/labor/">
  </a>
  <a href="">
    <img alt="npm" src="https://badgen.net/github/contributors/ahsanu123/labor/">
  </a>
  <a href="">
    <img alt="npm" src="https://badgen.net/github/branches/ahsanu123/labor/">
  </a>
  <a href="https://github.com/ahsanu123/labor/blob/main/LICENSE">
    <img alt="licence" src="https://badgen.net/github/license/ahsanu123/labor/">
  </a>
</p>

<p align="center">
  <img src="./labor-logo.svg" style="width: 900px;  "/> <br/>
   App For Iwaki
</p> 

## 🚀 Useful Note 

- [Setup of Android Development without andorid studio use Kotlin Multiplatform](./Env_Setup.md)
- to install android sdk in windows you can use chocolatey -> `choco install android-sdk -y`
- Jetpack Visual Hierarchy Overview
- 
```shell
├── Architecture
│   ├── Lifecycle (Manages activity/fragment lifecycle)
│   ├── LiveData (Observable data holder)
│   ├── ViewModel (Holds UI-related data)
│   ├── Room (SQLite object mapping)
│   └── WorkManager (Background work)
│
├── UI
│   ├── Jetpack Compose (Declarative UI)
│   │   ├── UI Toolkit (Layout, Material components)
│   │   ├── Animation (Motion and transitions)
│   │   └── Tooling (Preview, Debugging)
│   ├── AppCompat (Backward compatibility)
│   └── Fragment (UI modularity)
│
├── Behavior
│   ├── Notifications (Alerts and messaging)
│   ├── Permissions (Runtime permissions)
│   └── Sharing (Content sharing between apps)
│
└── Foundation
    ├── Android KTX (Kotlin extensions for Android APIs)
    ├── App Startup (Initialize components quickly)
    └── Test (JUnit extensions, Espresso, etc.)
```


## Command Logs 

- `gradle init`, generate gradle project

### 🍎 Project Log

- 4 April 2025, create documentation about setup android development wihtout android studio in kotlin multiplatform

## KMP Readme 

This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [YouTrack](https://youtrack.jetbrains.com/newIssue?project=CMP).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.

### 🌼 Reference 
- [Kotlin Multiplatform (android and ios) docs](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-create-first-app.html)
- [kotlin library search](https://klibs.io/)
- [compose material component](https://developer.android.com/develop/ui/compose/components)
- [compose material 3 theme](https://developer.android.com/develop/ui/compose/designsystems/material3)
- [Stetho](http://facebook.github.io/stetho/) -> sophisticated debug bridge for Android applications
- [Awesome Kotlin](https://kotlin.link/)
- ✅ ORM: Room
- ✅ DI: Koin
- [vico chart library](https://www.patrykandpatrick.com/vico/guide/stable)
- ✅ State Management: Decompose / ViewModel
- ✅ Networking: Ktor or Retrofit
- [android architecture explained](https://medium.com/@pinarkocak/mvc-mvp-and-mvvm-design-patterns-82317d6efeac)
