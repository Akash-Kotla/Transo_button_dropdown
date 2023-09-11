package com.example.button_exp

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView


class ExpandableListAdapter(
    private val context: Context,
    private val groupList: List<String>,
    private val childList: HashMap<String, List<String>>
) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return groupList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return childList[groupList[groupPosition]]?.size ?: 0
    }

    override fun getGroup(groupPosition: Int): Any {
        return groupList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return childList[groupList[groupPosition]]?.get(childPosition) ?: ""
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    @SuppressLint("InflateParams")
    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var view = convertView
        if (view == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.list_group, null)
        }

        val groupTextView = view!!.findViewById<TextView>(R.id.groupTitle)
        groupTextView.text = groupList[groupPosition]

        return view
    }

    @SuppressLint("InflateParams")
    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var view = convertView
        if (view == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.list_item, null)
        }

        val childTextView = view!!.findViewById<TextView>(R.id.childItem)
        val childItemText = childList[groupList[groupPosition]]?.get(childPosition) ?: ""

        val boldtext = listOf("1. Transit","2. Transit LTL","3. Transit FTL","4. Pending LTL","5. Pending POD(proof of delivery","6. Completed","Note:")

        val spannableString = SpannableString(childItemText)

        for (bold in boldtext) {
            var startIndex = 0
            while (startIndex != -1 && startIndex < childItemText.length) {
                startIndex = childItemText.indexOf(bold, startIndex)
                if (startIndex != -1) {
                    val endIndex = startIndex + bold.length
                    val boldSpan = StyleSpan(Typeface.BOLD)
                    spannableString.setSpan(boldSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                    // Set black text color for the non-bold portion
                    // spannableString.setSpan(ForegroundColorSpan(Color.BLACK), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                     startIndex = endIndex
                }
            }
        }
            childTextView.text = spannableString

        val childIcon = view.findViewById<ImageView>(R.id.child_icon)
        childIcon.setImageResource(R.drawable.video_icon)

            return view
        }
}













