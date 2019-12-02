package io.github.qlain.themostsimplerecyclerview.view.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.qlain.themostsimplerecyclerview.R
import io.github.qlain.themostsimplerecyclerview.model.ItemModel

class MainFragment : Fragment(){
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.recyclerView = view.findViewById(R.id.container_recycler_view)

        this.recyclerView?.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            itemAnimator = DefaultItemAnimator()
            adapter = MainViewAdapter(
                generateItemList(),
                object : MainViewAdapter.ListListener {
                    override fun onClickItem(tappedView: View, itemModel: ItemModel) {
                        this@MainFragment.onClickItem(tappedView, itemModel)
                    }
                }
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        this.recyclerView?.adapter = null
        this.recyclerView = null
    }

    //RecyclerViewの生成時に一度だけ動く
    private fun generateItemList(): List<ItemModel> {
        val itemList = mutableListOf<ItemModel>()
        for (i in 0..100) {
            val item: ItemModel = ItemModel().apply {
                text = "花丸ちゃん、おまんじゅう${i}個目だよ"
            }
            itemList.add(item)
        }
        return itemList
    }

    //RecyclerView内のアイテムがクリックされたときに動く
    private fun onClickItem(tappedView: View, itemModel: ItemModel) {
    }
}