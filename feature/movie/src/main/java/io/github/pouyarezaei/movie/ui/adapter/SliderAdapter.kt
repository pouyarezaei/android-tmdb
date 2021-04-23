package io.github.pouyarezaei.movie.ui.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import io.github.pouyarezaei.movie.ui.fragment.SliderItemFragment

class SliderAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    private val TAG = "SliderAdapter"
    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        Log.d(TAG, "createFragment: $position")
        return SliderItemFragment()
    }
}