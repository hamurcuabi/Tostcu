# Tostcu

<div align="center">
	<img src="https://downloader.disk.yandex.ru/preview/25d00295526f8a7aa36bfd56cfd033621600a16a7e49ebdd3ce86b6f8714498a/5c111576/jo1RqTg1tVw_8ETCesvFHVaffrEMkgTKijd9gg60fvycEl6zrIQbD2ZnS7DP6a4rk4Kt8hXkQDv86zIGKzedsA%3D%3D?uid=0&filename=tostcu.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&tknv=v2&size=2048x2048" width="128">
</div>

Tostcu makes Toasts to feed your app.

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	 implementation 'com.github.hamurcuabi:Tostcu:0.1.0'
}
```

## Configuration

This step is optional, but if you want you can configure some Tostcu parameters. Place this anywhere in your app:

```java
Toasty.Config.getInstance()
    .setErrorColor(@ColorInt int errorColor) // optional
    .setInfoColor(@ColorInt int infoColor) // optional
    .setSuccessColor(@ColorInt int successColor) // optional
    .setWarningColor(@ColorInt int warningColor) // optional
    .setTextColor(@ColorInt int textColor) // optional
    .setToastTypeface(@NonNull Typeface typeface) // optional
    .setTextSize(int sizeInSp) // optional
    .setWithAnim(boolean with_anim)//optional
    .apply(); // required
```

You can reset the configuration by using `reset()` method:

```java
Toasty.Config.reset();
```

## Usage
This following basic methodes have default variables. You can change them we have some easy methodes.
```
```LENGTH_SHORT, 
```with_anim=true,
```text_size=16 sp, 
```typeface=(sans-serif-condensed", Typeface.NORMAL),
```Gravity.Center
```

To display basic error Toast:

``` java
Tostcu.error(yourContext, "This is an error toast.");
```

To display basic success Toast:

``` java
Tostcu.success(yourContext, "This is an success toast.");
```
To display basic info Toast:

``` java
Tostcu.info(yourContext, "This is an info toast.");
```
To display basic warning Toast:

``` java
Tostcu.warning(yourContext, "This is an warning toast.");
```

You can also create your custom Toasts with the `custom()` method:
``` java
Tostcu.custom(yourContext, "I'm a custom Toast", yourDrwableResid,duration, bg_color, gravity, with_anim,typeface,text_size);
```

## Your messages can be CharSequence or StringRes 

``` example
Tostcu.warning(yourContext, "This is an warning toast.");

or

Tostcu.warning(yourContext, R.string.warning_message);
```

## Icon has a simple blink animation

This blink animation can be set <b>false</b> but it is <b>true</b> default.

## Screenshots

**Please click the image below to enlarge.**



Apps using Tostcu
--
<img src="https://lh3.googleusercontent.com/kkjF6Owgj0SOPD2qX5cUYV8cNCc4Mo-tM7me3aPwzh1Mn7ABP0nF1-WyQyGQ4ssOXA=s180-rw" />
<a href="https://play.google.com/store/apps/details?id=com.emrehmrc.musicapp">Muziczak Free Mp3</a>

	
      
