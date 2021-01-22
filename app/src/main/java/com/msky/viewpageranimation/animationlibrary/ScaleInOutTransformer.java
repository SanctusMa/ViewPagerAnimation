package com.msky.viewpageranimation.animationlibrary;

import android.util.Log;
import android.view.View;

public class ScaleInOutTransformer extends ABaseTransformer {

	@Override
	protected void onTransform(View view, float position) {
		Log.e("view:" , view.toString());
		view.setPivotX(position < 0 ? 0 : view.getWidth());
		view.setPivotY(view.getHeight() / 2f);
		float scale = position < 0 ? 1f + position : 1f - position;
		view.setScaleX(scale);
		view.setScaleY(scale);
	}
}
