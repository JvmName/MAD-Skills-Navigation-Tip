package dev.jvmname.navsample.library

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

class LibraryFragment : Fragment(R.layout.library_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<MaterialButton>(R.id.button).setOnClickListener {
            findNavController().navigate(Uri.parse("myapp://main-screen/"))
        }
    }
}