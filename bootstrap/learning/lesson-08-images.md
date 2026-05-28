# Lesson 8: Images

## Responsive Images

```html
<img src="photo.jpg" class="img-fluid" alt="Responsive">
```

`.img-fluid` applies `max-width: 100%` and `height: auto`, scaling the image to fit its container.

## Image Shapes

```html
<img src="photo.jpg" class="rounded" alt="Rounded corners">
<img src="photo.jpg" class="rounded-circle" alt="Circle">
<img src="photo.jpg" class="img-thumbnail" alt="Thumbnail with border">
```

## Aligning Images

```html
<!-- Center with mx-auto + d-block -->
<img src="photo.jpg" class="mx-auto d-block" alt="Centered">

<!-- Float -->
<img src="photo.jpg" class="float-start" alt="Left">
<img src="photo.jpg" class="float-end" alt="Right">
```

## Picture Element

```html
<picture>
  <source srcset="photo-large.webp" type="image/webp">
  <source srcset="photo-large.jpg" type="image/jpeg">
  <img src="photo-large.jpg" class="img-fluid" alt="Fallback">
</picture>
```

## Figure

```html
<figure class="figure">
  <img src="photo.jpg" class="figure-img img-fluid rounded" alt="">
  <figcaption class="figure-caption">Photo caption here.</figcaption>
</figure>
```

---

## Interview Questions

**Q: What does `.img-fluid` do?**
A: It makes images responsive by applying `max-width: 100%` and `height: auto`, so the image scales down on smaller screens but never exceeds its original size.

**Q: How do you create a circular image in Bootstrap?**
A: Use `.rounded-circle` class. For example: `<img src="..." class="rounded-circle" width="150">`.

**Q: What is the difference between `.rounded` and `.img-thumbnail`?**
A: `.rounded` only adds `border-radius: 0.375rem`. `.img-thumbnail` adds a 4px rounded border with padding, giving the image a framed thumbnail appearance.
