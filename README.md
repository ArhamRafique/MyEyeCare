<<<<<<< HEAD
# 👁️💧 Eye & Water Reminder App

[![Play Store](https://img.shields.io/badge/Download-PlayStore-green?logo=googleplay)](https://play.google.com/store/apps/details?id=com.alpha.myeyecare)  
[![CI](https://github.com/shubham-gadekar-alpha/myEyeCare/actions/workflows/CI-Checks.yml/badge.svg)](https://github.com/shubham-gadekar-alpha/myEyeCare/actions/workflows/CI-Checks.yml)

_A simple yet powerful reminder app to take care of your **eye health** and **hydration needs**._
(**Currently under review & available for testing only. If you wish to test this app, please share your email so I can send you an invite link.**)

---

## 📱 About the App
Eye & Water Reminder is an Android application designed to remind users to:
- Take regular **eye breaks** (reducing digital strain).
- Drink enough **water** throughout the day.

The app is lightweight, simple, and **perfect for health-conscious users**.  
This repository is mainly created for **learning purposes** and is **open to contributions** from developers worldwide.

---

## 🚀 Features
✅ Smart reminders for both **eye breaks** & **water intake**  
✅ Customizable reminder frequency  
✅ User-friendly **UI with Material Design**  
✅ Lightweight & battery-efficient  
✅ Free & Open Source  
✅ Perfect for **Android learning** (Jetpack Compose, MVVM, Room, Clean Architecture, etc.)
=======
 👁️ MyEyeCare – Smart Eye Health Reminder App

**MyEyeCare** is a modern Android application designed to help users maintain healthy eye habits through smart reminders, weekly analytics, and clean user experience. The app is built using **industry-standard Android architecture** with a strong focus on scalability, testability, and performance.

---

## ✨ Features

* ⏰ **Smart Eye Care Reminders**

  * Flexible scheduling (daily / weekly)
  * Background execution using WorkManager

* 📊 **Weekly Analytics**

  * Track completed vs missed reminders
  * Visual progress indicators for better habit awareness

* 🧠 **Clean Architecture**

  * Clear separation of concerns (Data, Domain, UI)
  * Easy to maintain and extend

* 🎨 **Modern UI**

  * Jetpack Compose based UI
  * Material 3 design system
  * Smooth navigation & animations

* 🔒 **Reliable & Offline-First**

  * Local storage using Room Database
  * DataStore for user preferences
>>>>>>> 183d454b57b31745fae3b7f2d6b22b705c535204

---

## 🛠 Tech Stack
<<<<<<< HEAD
- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel) with Clean Architecture 
- **UI Toolkit**: Jetpack Compose
- **Local Storage**: Room Database
- **Dependency Injection**: Hilt
- **Async & Reactive**: Coroutines & Flow
- **Background Tasks**: WorkManager
- **Static Analysis**: Detekt (Code quality & lint checks)
- **Unit Testing**: JUnit + JaCoCo (Code coverage reports)
- **CI/CD**: GitHub Actions (Automated build, unit tests, and linting pipeline)

---

## ⚙️ CI/CD Pipeline
This project integrates **GitHub Actions** to ensure high code quality and reliability.  
The pipeline includes:
- 🔍 **Detekt Analysis** → Automated Kotlin static code analysis for clean, maintainable code.
- 🏗 **Build Verification** → Ensures that every commit/PR successfully compiles the Android project.
- ✅ **Unit Test Execution** → Runs unit tests with coverage checks to validate correctness.

These checks are triggered automatically on every **pull request** to maintain project quality.

--- 

```

com.alpha.myeyecare/ 
│ 
├── common/                          
│   ├── constants/ 
│   │   ├── AppDestinations.kt
│   │   └── ReminderTypes.kt 
│   └── utils/ 
│       ├── ExtensionFunctions.kt            
│       └── UtilFunctions.kt         
│ 
├── data/                            
│   ├── local/                       
│   │   ├── converters/ 
│   │   │   ├── Converters.kt 
│   │   ├── dao/ 
│   │   │   ├── ReminderDao.kt  
│   │   ├── entities/ 
│   │   │   ├── Reminder.kt  
│   │   └── ReminderDatabase.kt 
│   │ 
│   └── repository/                 # Repository implementation
│       ├── SuggectionRepositoryImpl.kt  
│       └── ReminderRepositoryImpl.kt  
│  
├── di/                             
│   ├── AppModule.kt 
│   ├── DatabaseModule.kt
│   └── RemoteModule.kt 
│
├── domain/                         
│   ├── model/ 
│   │   ├── DaysOfWeek.kt 
│   │   ├── ReminderDetails.kt 
│   │   ├── ReminderFrequency.kt 
│   │   └── Suggestion.kt 
│   │ 
│   ├── repository/                 # Abstract repository interfaces 
│   │   ├── ReminderRepository.kt 
│   │   └── SuggestionRepository.kt 
│   │ 
│   └── usecase/                   
│       ├── CheckReminderStatusUseCase.kt 
│       ├── GetReminderDetailsUserCase.kt 
│       ├── SaveReminderUseCase.kt  
│       └── SaveSuggestionsUseCase.kt 
│ 
├── presentation/                  
│   ├── navigation/ 
│   │    └── NavGraph.kt  
│   └── ui/                   
│       ├── common/ 
│       │   └── CommonUI.kt
│       ├── detailsScreen/ 
│       │   ├── SetupReminderScreen.kt
│       │   └── SetupReminderViewModel.kt
│       ├── home/ 
│       │   └── HomeScreen.kt 
│       ├── splash/ 
│       │   ├── SplashScreen.kt
│       │   └── SplashViewModel.kt 
│       ├── suggestion/ 
│       │   ├── SuggestionSubmissionViewModel.kt 
│       │   └── UserSuggestionScreen.kt
│       ├── theme/ 
│       │   ├── Color.kt 
│       │   ├── Theme.kt 
│       │   └── Type.kt 
│       └── userPermission.kt  
├── Worker/                  
│   ├── ReminderScheduler.kt
│   └── ReminderWorker.kt 
├── MainActivity.kt                   
└── MyApplication.kt                 

```

---

## 📸 Screenshots
| Home Screen                                           | Reminder Screen                                               | Settings                                                     |
|-------------------------------------------------------|---------------------------------------------------------------|--------------------------------------------------------------|
| <img src="screenshots/Home-Screen.png" height="400"/> | <img src="screenshots/Set-Reminder-Screen.png" height="400"/> | <img src="screenshots/Suggestions-Screen.png" height="400"/> |

---

## 🤝 Contributing
We welcome contributions! 🚀  
If you’d like to add new features, improve UI/UX, or optimize performance:
1. Fork this repo 🍴
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request 🎉

Every PR will go through automated **build, lint, and test checks** before merging.

---

## 👨‍💻 Developers
- **Shubham Gadekar** (Developer)
- **Nitin Tyagi** (Developer)
- Open to all contributors! Add yourself here via PR.

---

## 🎯 Why Open Source?
This project is **for learning purposes**. Developers can explore:
- **Jetpack Compose UI development**
- **MVVM with Kotlin**
- **Dependency Injection with Hilt**
- **Room database**
- **WorkManager background scheduling**
- **Static analysis & linting with Detekt**
- **CI/CD automation with GitHub Actions**

---

## 📥 Download
Get it now on the Play Store:  
👉 [Download from Play Store](https://play.google.com/store/apps/details?id=com.alpha.myeyecare)

---

## ⭐ Support
If you find this project helpful, don’t forget to **star ⭐ the repo** and share it with others!  
=======

* **Language:** Kotlin
* **UI:** Jetpack Compose
* **Architecture:** MVVM + Clean Architecture
* **Async:** Kotlin Coroutines & Flow
* **Local Storage:** Room Database
* **Preferences:** DataStore
* **DI:** Hilt
* **Background Tasks:** WorkManager
* **Testing:** JUnit + JaCoCo
* **Code Quality:** Detekt
* **CI/CD:** GitHub Actions

---

## 🧱 Project Architecture

Presentation (UI, ViewModels)
        ↓
Domain (UseCases, Models, Repositories)
        ↓
Data (Room DB, DAO, Repository Impl)


This structure ensures:

* High testability
* Loose coupling
* Easy scalability

---

## 📊 Analytics System

The app tracks reminder history and generates **weekly analytics**, showing:

* Total reminders
* Completed reminders
* Missed reminders
* Completion percentage

This helps users build better eye-care habits over time.

---

## 🚀 CI/CD & Quality

* Automated builds & tests via **GitHub Actions**
* Code quality checks using **Detekt**
* Test coverage reports with **JaCoCo**

---

## 🧑‍💻 Author

**Ahmad Raza**
Android Developer | Clean Architecture | Jetpack Compose

---

## 📄 License

This project is licensed under the **MIT License**.



>>>>>>> 183d454b57b31745fae3b7f2d6b22b705c535204
