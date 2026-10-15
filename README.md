# Android_activity_lifecycle_MAD_EXP2
Android Activity Lifecycle demonstration using Kotlin. Displays lifecycle callback methods with Toast messages to understand Activity state transitions.


## Project Overview

The Android Activity Lifecycle defines the different states through which an Activity passes during its lifetime. This project demonstrates each lifecycle callback by displaying a Toast message whenever the corresponding method is executed.

---

##  Objectives

- Understand the Android Activity Lifecycle.
- Learn the purpose of each lifecycle callback method.
- Observe lifecycle transitions during app execution.
- Implement lifecycle methods using Kotlin.

---

## Features

- Displays the Activity Lifecycle flow.
- Shows Toast messages for every lifecycle callback.
- Simple and clean user interface.
- Developed using Kotlin.
- Suitable for Android beginners and academic laboratory experiments.

---

##  Technologies Used

- Android Studio
- Kotlin
- Android SDK
- ConstraintLayout
- XML

---

## Lifecycle Methods Implemented

- `onCreate()`
- `onStart()`
- `onResume()`
- `onPause()`
- `onStop()`
- `onRestart()`
- `onDestroy()`

---

## Project Structure

```
ActivityLifecycle/
│
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml
│   │
│   ├── java/
│   │   └── MainActivity.kt
│   │
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml
│   │   ├── values/
│   │   │   └── strings.xml
│   │   └── mipmap/
│   │
│   └── build.gradle.kts
│
├── gradle/
├── settings.gradle.kts
└── README.md
```

---

##  How to Run

1. Clone the repository.

```
git clone https://github.com/your-username/ActivityLifecycle.git
```

2. Open the project in Android Studio.

3. Allow Gradle Sync to complete.

4. Connect an Android device or start an emulator.

5. Click **Run ▶** to launch the application.

---

## Working

When the application starts:

```
onCreate()
↓
onStart()
↓
onResume()
```

When the Home button is pressed:

```
onPause()
↓
onStop()
```

When the application is reopened:

```
onRestart()
↓
onStart()
↓
onResume()
```

When the Back button is pressed:

```
onPause()
↓
onStop()
↓
onDestroy()
```

Each lifecycle callback displays a Toast message on the screen.

---

## Output


## Output Video

This video demonstrates the Android Activity Lifecycle application and its Toast messages for different lifecycle callback methods.

[![Watch Activity Lifecycle Output Video](https://img.shields.io/badge/Watch-Output%20Video-red?style=for-the-badge&logo=youtube)](https://github.com/karpaga-akshaya/Android_activity_lifecycle_MAD_EXP2/blob/main/OUTPUT_VIDEO.mp4)

**Video Link:** [OUTPUT_VIDEO.mp4](https://github.com/karpaga-akshaya/Android_activity_lifecycle_MAD_EXP2/blob/main/OUTPUT_VIDEO.mp4)


---

##  Learning Outcomes

- Understand Android Activity states.
- Learn when lifecycle methods are invoked.
- Gain practical experience with Android application development.
- Understand the importance of lifecycle management in Android apps.

