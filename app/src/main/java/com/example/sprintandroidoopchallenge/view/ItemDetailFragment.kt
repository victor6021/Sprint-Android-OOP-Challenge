package com.example.sprintandroidoopchallenge.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sprintandroidoopchallenge.R
import com.example.sprintandroidoopchallenge.api.AoETwoInstance
import com.example.sprintandroidoopchallenge.dummy.DummyContent
import com.example.sprintandroidoopchallenge.model.AgeOfEmpiresTwo
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: DummyContent.AgeOfEmpiresTwo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.
                item = DummyContent.ITEM_MAP[it.getString(ARG_ITEM_ID)]
                activity?.toolbar_layout?.title = item?.content
            }
        }

        AoETwoInstance.getAoETwo("id").enqueue(object : Callback<AgeOfEmpiresTwo> {
            override fun onFailure(call: Call<AgeOfEmpiresTwo>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<AgeOfEmpiresTwo>,
                response: Response<AgeOfEmpiresTwo>
            ) {
                val ageOfEmpiresTwo = response.body()

                val civilization = ageOfEmpiresTwo?.civil?.civilizations?.get(1)?.id

                val unit = ageOfEmpiresTwo?.units?.unit?.get(1)?.id

                val structure = ageOfEmpiresTwo?.structures?.structure?.get(1)?.id

                val technology = ageOfEmpiresTwo?.technologies?.technology?.get(1)?.id
            }

        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)

        // Show the dummy content as text in a TextView.
        item?.let {
            rootView.item_detail.text = it.details
        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
