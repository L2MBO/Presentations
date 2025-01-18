package com.example.battletanks
import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.FrameLayout

class GridDrawer (private val context: Context)
{
fun drawGrid(){
    val container = binding.container
    drawHorizontalLines(container)
    drawVerticalLines(container)
}
    private fun drawHorizontalLines(container: FrameLayout?){
        var topMargin = 0
        while (topMargin <= container!!.height) {
            val horizotalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1)
            topMargin += 50
            layoutParams.topMargin = topMargin
            horizotalLine.layoutParams = layoutParams
            horizotalLine.setBackgroundColor(Color.WHITE)
            container.addView((horizotalLine))
        }
    }
    private fun drawVerticalLines(container: FrameLayout?){
        var leftMargin = 0
        while (leftMargin <= container!!.width) {
            val verticalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams (1, FrameLayout.LayoutParams.MATCH_PARENT)
            leftMargin += 50
            layoutParams.leftMargin = leftMargin
            verticalLine.layoutParams = layoutParams
            verticalLine.setBackgroundColor(Color.WHITE)
            container.addView(verticalLine)
        }
    }
}