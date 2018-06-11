package info.czekanski.bet.domain.match.summary.view_holder

import android.support.v7.widget.RecyclerView
import android.view.View
import info.czekanski.bet.domain.match.summary.cells.SummaryCell
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.holder_summary_summary.*


class SummaryViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(cell: SummaryCell) {
        textStake.text = "${cell.stake} zł"
        textJackpot.text = "${cell.jackpot} zł"
    }
}