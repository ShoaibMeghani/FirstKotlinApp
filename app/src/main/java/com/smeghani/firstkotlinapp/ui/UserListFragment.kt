package com.smeghani.firstkotlinapp.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smeghani.firstkotlinapp.R

import com.smeghani.firstkotlinapp.models.domain.User
import com.smeghani.firstkotlinapp.models.domain.UserList
import com.smeghani.firstkotlinapp.network.UserAPI
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_user_list.*
import kotlinx.android.synthetic.main.item_user.view.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.support.v4.toast
import org.jetbrains.anko.uiThread

/**
 * Created by shoaibmeghani on 18/01/2018.
 */
class UserListFragment : Fragment() {

    //private lateinit var userList: UserList

    companion object {
        // private val ARG_USER_LIST = "user_list"

        //Kotlin's version of Android's newInstance pattern
        fun newInstance(): UserListFragment {
            val args = Bundle()
            //args.putParcelable(ARG_USER_LIST, userList)
            val frag = UserListFragment()
            frag.arguments = args
            return frag
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_user_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val api = UserAPI()

        // using Anko Coroutines to run task on background
        doAsync {
            var response = api.getUsers()
            uiThread {
                vUserList.adapter = UserListAdapter(response) { toast(it.name) }
            }
        }


    }

}