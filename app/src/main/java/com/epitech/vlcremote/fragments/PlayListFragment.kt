package com.epitech.vlcremote.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.epitech.vlcremote.R
import com.epitech.vlcremote.services.RemoteService

/**
* Created by initerworker on 05/02/18.
*/

class PlayListFragment : Fragment() {

    var remoteService: RemoteService? = null

    companion object {
        fun newInstance(): PlayListFragment {
            return PlayListFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view: RecyclerView = inflater!!.inflate(R.layout.fragment_playlist, container, false) as RecyclerView

        // TODO: write all user interface
        with(view) {

        }

        return view
    }
}