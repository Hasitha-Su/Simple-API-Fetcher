
# Simple API Fetcher for Android

## Overview

Simple API Fetcher is an Android application designed to fetch and display data from a web API. It leverages Kotlin's `AsyncTask` for performing background tasks and handles HTTP requests to fetch the required data. The application is written in Kotlin and uses Android's native libraries.

## Features

- Fetches data from the API "https://jsonplaceholder.typicode.com/todos/1"
- Displays the fetched data in a TextView
- Uses Android's AsyncTask for background operations

## How to Run

1. Clone the repository to your local machine.
2. Open the project in Android Studio.
3. Run the application on an emulator or an Android device.

## Code Structure

- `FetchDataTask.kt`: This class handles the background HTTP GET requests and fetches data from the API.
- `MainActivity.kt`: The entry point for the application. It initializes the UI and triggers the API call via `FetchDataTask`.

## Documentation

The code is well-documented using KDoc, Kotlin's native documentation system. You can find comments explaining classes, methods, and key functionalities throughout the codebase.

## Known Bugs

- The application currently does not handle network errors gracefully. If the API call fails, the user is presented with a default "Error" message.
- The use of `AsyncTask` is deprecated in modern Android development. Future versions should transition to more up-to-date methods like Coroutines or RxJava for background tasks.

## Future Development

1. **Error Handling**: Implement more comprehensive error handling for network issues, timeouts, or unexpected API behavior.
2. **UI Enhancements**: Implement a more user-friendly interface, possibly with loading indicators and better layout designs.
3. **Code Modernization**: Transition away from deprecated `AsyncTask` to more modern Android background execution mechanisms like Kotlin Coroutines or RxJava.

## Contributing

If you'd like to contribute, please fork the repository and make changes as you'd like. Pull requests are warmly welcome.

## License

This project is open-source and available under the MIT License.
