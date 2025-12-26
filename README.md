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

---

## 🛠 Tech Stack

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



