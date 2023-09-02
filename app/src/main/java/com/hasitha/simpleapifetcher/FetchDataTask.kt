package com.hasitha.simpleapifetcher

import android.os.AsyncTask
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

/**
 * FetchDataTask is an AsyncTask that performs HTTP GET requests in the background.
 * This class takes a URL as a parameter and returns the response as a String.
 *
 * @property callback A lambda function that is called when the AsyncTask finishes executing.
 * This function takes the HTTP response as a String parameter.
 */
class FetchDataTask(val callback: (String) -> Unit) : AsyncTask<String, Void, String>() {

    /**
     * Executes the HTTP GET request in the background.
     *
     * @param params An array containing the URL string at its first index.
     * @return The HTTP response as a String.
     */
    @Deprecated("Deprecated in Java")
    override fun doInBackground(vararg params: String?): String {
        val urlString = params[0]
        val url = URL(urlString)

        //returns an HttpURLConnection object.
        val connection = url.openConnection() as HttpURLConnection

        try {

            val inStream = BufferedReader(InputStreamReader(connection.inputStream))

            val text = StringBuilder()
            var line: String?
            while (inStream.readLine().also { line = it } != null) {
                text.append(line)
                text.append('\n')
            }

            return text.toString()

        } finally {
            connection.disconnect()
        }
    }

    /**
     * Called after doInBackground finishes execution.
     * Calls the [callback] function with the HTTP response.
     *
     * @param result The HTTP response as a String. If the request failed, it's null.
     */
    @Deprecated("Deprecated in Java")
    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        callback(result ?: "Error")
    }
}
