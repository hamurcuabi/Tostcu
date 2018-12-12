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


<img src="https://downloader.disk.yandex.ru/preview/d0e007cb7f5bf7f8ac42aa557c07cfd7657bad561bff56522dca006f92f50a6f/5c112215/Sn-_hX-GM0j6GZJgKYIfoVs3MJ95Rs6osfHdJl3co2FOZ_PsZ2j1BvaMjz5UyVOm_bHVFZxU3zc2Ioav2C-aEw%3D%3D?uid=0&filename=5.JPG&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&tknv=v2&size=2048x2048" style="max-width:100%;"/>
<img src="https://downloader.disk.yandex.ru/preview/2e92f6997dc079037b62edb4d0bbcfcfcbf018284a330d5da50e17ab1a31ac5a/5c112260/dnd0AOowkYzxu2LiACJjgVs3MJ95Rs6osfHdJl3co2FctKEry-iYIUpEGTP_fMr7owVfuas8qZuShpYmcqCPDQ%3D%3D?uid=0&filename=4.JPG&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&tknv=v2&size=XXXL&crop=0" style="max-width:100%;"/>
<img src="https://downloader.disk.yandex.ru/preview/76767e9fc2fa2408c0089adad4c6ac495cbe313d74d4ebd3f8b51210a8b5454d/5c1122b6/7iuKXmPG8hjAOPu3OxD4-OVQ3uoHcYykeR39cLsUbcNvtUr4ypeDRNrWO_sVT3o6C_2jTvFjZNy3C9-VAPNj7A%3D%3D?uid=0&filename=3.JPG&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&tknv=v2&size=XXXL&crop=0" style="max-width:100%;"/>
<img src="https://downloader.disk.yandex.ru/preview/a11c0144beb870d763d5295bef0b6bae6fd68feb0ed55af907ee526a86b49762/5c1122d6/dKxCqMMhivanSzHzKplhEuVQ3uoHcYykeR39cLsUbcPgHhzBeObrUZi9GjJaw0PExOB2qzWgCbCFa5uQOMSUlQ%3D%3D?uid=0&filename=1.JPG&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&tknv=v2&size=XXXL&crop=0" style="max-width:100%;"/>
<img src="https://downloader.disk.yandex.ru/preview/f8aa06774dfad545b0189d4096a8abf945eee0d721675242efd27ebb74263e4f/5c1122ec/ohyhuJdaiSvJ8ig0RgmEL-VQ3uoHcYykeR39cLsUbcM6yVZOhshEEyPidufAtKJ3jCt4EHcevMZ0KCL_lKwczA%3D%3D?uid=0&filename=2.JPG&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&tknv=v2&size=XXXL&crop=0" style="max-width:100%;"/>




Apps using Tostcu
--
<img src="https://lh3.googleusercontent.com/kkjF6Owgj0SOPD2qX5cUYV8cNCc4Mo-tM7me3aPwzh1Mn7ABP0nF1-WyQyGQ4ssOXA=s180-rw" />
<a href="https://play.google.com/store/apps/details?id=com.emrehmrc.musicapp">Muziczak Free Mp3</a>

	
      
