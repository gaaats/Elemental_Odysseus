package com.miHoYo.Gensh.veeeevvv

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.miHoYo.Gensh.databinding.ActivityViViviviiviv2Binding
import com.miHoYo.Gensh.frgtgtgtgt.Gygfrgygrfrfrf
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.gtntgngtnjgtnj
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.gtitghugt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.bgngtjgtjgtjigt
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class ViViviviivivActivity2 : AppCompatActivity() {

    companion object{

        const val DIGIT = "digit"
        const val EQUALS = "equals"
        const val PLUS = "plus"
        const val MINUS = "minus"
        const val MULTIPLY = "multiply"
        const val DIVIDE = "divide"
        const val PERCENT = "percent"
        const val POWER = "power"
        const val ROOT = "root"
        const val DECIMAL = "decimal"
        const val CLEAR = "clear"
        const val RESET = "reset"

        const val NAN = "NaN"
        const val ZERO = "zero"
        const val ONE = "one"
        const val TWO = "two"
        const val THREE = "three"
        const val FOUR = "four"
        const val FIVE = "five"
        const val SIX = "six"
        const val SEVEN = "seven"
        const val EIGHT = "eight"
        const val NINE = "nine"

        const val DOT = "."
        const val COMMA = ","

        // shared prefs
        const val USE_COMMA_AS_DECIMAL_MARK = "use_comma_as_decimal_mark"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindBeamgtgtgtgt = ActivityViViviviiviv2Binding.inflate(layoutInflater)
        beamgttggt = WebView(this)
        setContentView(beamgttggt)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(beamgttggt, true)
        gthgtihtghtggthgtugt.gtntgkgtkngt(beamgttggt)

        beamgttggt.webViewClient = CustomViewggtgtgtgtgt()
        beamgttggt.webChromeClient = IFhrfrfgyrfgfrggrfyrf()
        beamgttggt.loadUrl(ururururururururgtthyhyhy())
    }

    private lateinit var bindBeamgtgtgtgt: ActivityViViviviiviv2Binding
    lateinit var beamgttggt: WebView
    private var mFilePathCallbackgthyhhyhy: ValueCallback<Array<Uri>>? = null
    private var mCameraPhotoPathgttggtgt: String? = null
    private val INPUT_FILE_REQUEST_CODEgtgtgtgt = 1

    private val gthgtihtghtggthgtugt by viewModel<Gygfrgygrfrfrf>(
        named("BeamModel")
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != INPUT_FILE_REQUEST_CODEgtgtgtgt || mFilePathCallbackgthyhhyhy == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (mCameraPhotoPathgttggtgt != null) {
                    results = arrayOf(Uri.parse(mCameraPhotoPathgttggtgt))
                }
            } else {
                val dataString = data.dataString
                if (dataString != null) {
                    results = arrayOf(Uri.parse(dataString))
                }
            }
        }
        mFilePathCallbackgthyhhyhy!!.onReceiveValue(results)
        mFilePathCallbackgthyhhyhy = null
        return
    }

    inner class CustomViewggtgtgtgtgt : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (gthgtihtghtggthgtugt.efrhjbrfbbfr(url)) {

                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    startActivity(intent)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            saveUrlgttggtgt(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@ViViviviivivActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class IFhrfrfgyrfgfrggrfyrf : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            mFilePathCallbackgthyhhyhy?.onReceiveValue(null)
            mFilePathCallbackgthyhhyhy = filePath
            var takePictureIntent: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (takePictureIntent!!.resolveActivity(packageManager) != null) {
                var photoFile: File? = null
                try {
                    photoFile = createImageFile()
                    takePictureIntent.putExtra("PhotoPath", mCameraPhotoPathgttggtgt)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (photoFile != null) {
                    mCameraPhotoPathgttggtgt = "file:" + photoFile.absolutePath
                    takePictureIntent.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile)
                    )
                } else {
                    takePictureIntent = null
                }
            }
            val contentSelectionIntent = Intent(Intent.ACTION_GET_CONTENT)
            contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE)
            contentSelectionIntent.type = "image/*"
            val intentArray: Array<Intent?> =
                takePictureIntent?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val chooserIntent = Intent(Intent.ACTION_CHOOSER)
            chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent)
            chooserIntent.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray)
            startActivityForResult(chooserIntent, INPUT_FILE_REQUEST_CODEgtgtgtgt)
            return true
        }

        fun createImageFile(): File? {
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileName = "JPEG_" + timeStamp + "_"
            val storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                imageFileName,
                ".jpg",
                storageDir
            )
        }
    }

    private fun ururururururururgtthyhyhy(): String {

        val spoon = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val sharPre = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val link = sharPre.getString(gtitghugt, null)
        Log.d("lolo", link.toString())
        val myTrId = sharPre.getString(bgngtjgtjgtjigt, null)
        val afId = sharPre.getString(gtntgngtnjgtnj, null)


        when (sharPre.getString("WebInt", null)) {
            "campaign" -> {
                gthgtihtghtggthgtugt.gtijojji(afId.toString())
            }
            "deepLink" -> {
                gthgtihtghtggthgtugt.gtijojji(afId.toString())
            }
            "deepLinkNOApps" -> {
                gthgtihtghtggthgtugt.gtijojji(myTrId.toString())
            }
            "geo" -> {
                gthgtihtghtggthgtugt.gtijojji(myTrId.toString())
            }
        }


        return spoon.getString("SAVED_URL", link).toString()
    }

    var urlfifififgttggtgt = ""
    fun saveUrlgttggtgt(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfifififgttggtgt == "") {
                urlfifififgttggtgt = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }

    private var exitexitexitexitgttggt = false
    override fun onBackPressed() {

        if (beamgttggt.canGoBack()) {
            if (exitexitexitexitgttggt) {
                beamgttggt.stopLoading()
                beamgttggt.loadUrl(urlfifififgttggtgt)
            }
            this.exitexitexitexitgttggt = true
            beamgttggt.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                exitexitexitexitgttggt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}
