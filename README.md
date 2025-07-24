# 🎵 Emotion-Based Music Player

This project is music player that uses real-time emotion detection to automatically play songs that match the user's mood. It integrates camera-based emotion recognition and playlist management to enhance the music listening experience.

## 🧠 Features

- Detects real-time user emotion using facial recognition
- Maps detected emotion to corresponding playlists (happy, sad, angry, etc.)
- Plays local or online music based on detected emotion
- Simple and user-friendly interface
- Can work offline for playing downloaded songs

## 🛠️ Tech Stack

- **Platform:** Android (Java)
- **Machine Learning:** TensorFlow Lite / OpenCV
- **Audio:** Android MediaPlayer API

## 🗂️ Project Structure

- `app/src/main/java/`: App logic and UI activities
- `app/src/main/res/`: Layouts, drawable assets, and themes
- `assets/`: Pre-trained models for emotion detection

## 🔧 Requirements

- Android Studio (Arctic Fox or above)
- Android device with a front-facing camera
- Internet (optional for online music sources)
