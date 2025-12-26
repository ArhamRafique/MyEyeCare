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

## 🛠 Tech Stack
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

## ⭐ Support
If you find this project helpful, don’t forget to **star ⭐ the repo** and share it with others!  
======

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

**Arham Rafique**
Android Developer | Clean Architecture | Jetpack Compose

---

## 📄 License

This project is licensed under the **MIT License**.

