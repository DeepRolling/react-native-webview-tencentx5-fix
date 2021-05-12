package indi.fan.webviewx5;

import androidx.core.content.FileProvider;

/**
 * Providing a custom {@code FileProvider} prevents manifest {@code <provider>} name collisions.
 * <p>
 * See https://developer.android.com/guide/topics/manifest/provider-element.html for details.
 */
public class RNX5WebViewFileProvider extends FileProvider {

  // This class intentionally left blank.

}
