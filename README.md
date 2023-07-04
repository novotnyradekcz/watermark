# Watermark
Watermark project created as part of the Kotlin Basics course on JetBrains Academy.

## Stage 1/5: Image properties
### Description
**Watermarking** is a popular method to claim ownership of an image. It is the process of superimposing a logo or text on an image file. In this project, you will learn to apply watermarks of 24-bit or 32-bit color images with logos.

Before we start blending two images, you need to know how to get the image properties. Images can be accessed in a `BufferedImage` instance with the use of the `ImageIO` class. The image properties can be consequently obtained by using that particular instance.

If `image` is a `BufferedImage` instance, then the following properties can be acquired:

- Image height with `image.height` in pixels;

- Image width with `image.width` in pixels;

- The number of image components (can be colors or the alpha channel) with `image.colorModel.numComponents`;

- The number of image colors with `image.colorModel.numColorComponents`;

- The number of bits per pixel with `image.colorModel.pixelSize`;

- Image transparency setting with `image.transparency`.

The transparency property (`image.transparency`) can be either `Transparency.OPAQUE`, `Transparency.BITMASK` or `Transparency.TRANSLUCENT` (integers `1` to `3` respectively). Field descriptions can be found in [Transparency](https://docs.oracle.com/javase/7/docs/api/java/awt/Transparency.html); the correspondence is located between the field and the values at [Constant Field Values](https://docs.oracle.com/javase/7/docs/api/constant-values.html#java.awt.Transparency) under the `java.awt.Transparency` header.

For example, a 24-bit color image (that is, three 8-bit colors) has 3 components, 3 colors, and the `OPAQUE` transparency (a value of `1`). A 32-bit color image (three 8-bit colors and an alpha channel) has 4 components, 3 colors, and the `TRANSLUCENT` transparency (a value of `3`).

### Objectives
- Print the following message: `Input the image filename:`

- Users must input a filename (and a path if needed) of an image file. If the file exists, then print the following information:
```
Image file: [Image filename]
Width: [Image width]
Height: [Image height]
Number of components: [# of components]
Number of color components: [# of color components]
Bits per pixel: [Pixels for each pixel]
Transparency: [Transparency field]
```

- If the user inputs a path together with the filename, then print the path with the filename.

- If the file doesn't exist, print the following message: `The file [Image filename] doesn't exist.`

If you need some image files to experiment with your code for stage 1, then you can [download this zip file](https://stepik.org/media/attachments/lesson/623865/stage1.zip).
