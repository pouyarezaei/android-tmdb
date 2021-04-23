package io.github.pouyarezaei.movie.ui.movie

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import io.github.pouyarezaei.movie.R
import io.github.pouyarezaei.movie.ui.ZoomOutPageTransformer
import io.github.pouyarezaei.movie.ui.adapter.SliderAdapter

class MovieFragment : Fragment(R.layout.movie_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupPopularSlider(view)
    }

    private fun setupPopularSlider(view: View) {
        val viewpager = view.findViewById<ViewPager2>(R.id.popular_slider);
        viewpager.adapter = SliderAdapter(this)
        viewpager.setPageTransformer(ZoomOutPageTransformer())


    }

}