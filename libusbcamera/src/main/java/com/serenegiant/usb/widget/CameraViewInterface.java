/*
 *  UVCCamera
 *  library and sample to access to UVC web camera on non-rooted Android device
 *
 * Copyright (c) 2014-2017 saki t_saki@serenegiant.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  All files in the folder are under this Apache License, Version 2.0.
 *  Files in the libjpeg-turbo, libusb, libuvc, rapidjson folder
 *  may have a different license, see the respective files.
 */

package com.serenegiant.usb.widget;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;

import com.serenegiant.usb.encoder.IVideoEncoder;
import com.serenegiant.widget.IAspectRatioView;

public interface CameraViewInterface{ //extends IAspectRatioView {
	public interface Callback {
		public void onSurfaceCreated(CameraViewInterface view, Surface surface);
		public void onSurfaceChanged(CameraViewInterface view, Surface surface, int width, int height);
		public void onSurfaceDestroy(CameraViewInterface view, Surface surface);
	}
	public void onPause();
	public void onResume();
	public void setCallback(Callback callback);
	public SurfaceTexture getSurfaceTexture();
	public Surface getSurface();
	public boolean hasSurface();
	public void setVideoEncoder(final IVideoEncoder encoder);
	public Bitmap captureStillImage(int width,int height);
	void setAspectRatio(double v);

	void setAspectRatio(int i, int i1);

	double getAspectRatio();
}
