package ir.mrghost.videoplayer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class VideoViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageThumb;
    public CardView cardView;
    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
        imageThumb = itemView.findViewById(R.id.imageThumbnail);
        cardView = itemView.findViewById(R.id.mainContainer);
    }
}
