package com.anysoftkeyboard.keyboards.views.preview;

import android.graphics.Point;
import android.view.View;

import com.anysoftkeyboard.keyboards.Keyboard;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardBaseView;

public interface PositionCalculator {
	Point calculatePositionForPreview(Keyboard.Key key, View keyboardView, PreviewPopupTheme theme, int[] windowOffset);
}
