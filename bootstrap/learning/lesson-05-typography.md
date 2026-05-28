# Lesson 5: Typography

Bootstrap provides global defaults and utility classes for text styling.

## Headings

```html
<h1>h1 (2.5rem / 40px)</h1>
<h2>h2 (2rem / 32px)</h2>
<h3>h3 (1.75rem / 28px)</h3>
<h4>h4 (1.5rem / 24px)</h4>
<h5>h5 (1.25rem / 20px)</h5>
<h6>h6 (1rem / 16px)</h6>
```

### Display Headings

```html
<h1 class="display-1">Display 1</h1>
<h1 class="display-2">Display 2</h1>
<h1 class="display-3">Display 3</h1>
<h1 class="display-4">Display 4</h1>
<h1 class="display-5">Display 5</h1>
<h1 class="display-6">Display 6</h1>
```

### Heading with Secondary Text

```html
<h1>Bootstrap <small class="text-muted">5.3</small></h1>
```

## Inline Text

```html
<p><mark>Highlighted</mark> text</p>
<p><del>Deleted text</del></p>
<p><s>No longer accurate</s></p>
<p><ins>Inserted text</ins></p>
<p><u>Underlined text</u></p>
<p><small>Fine print</small></p>
<p><strong>Bold text</strong></p>
<p><em>Italic text</em></p>
```

## Text Utilities

```html
<p class="text-start">Left aligned</p>
<p class="text-center">Center aligned</p>
<p class="text-end">Right aligned</p>
<p class="text-nowrap">No wrap</p>
<p class="text-truncate">Long text truncated with ellipsis...</p>

<!-- Text transform -->
<p class="text-lowercase">LOWERCASE</p>
<p class="text-uppercase">uppercase</p>
<p class="text-capitalize">capitalized text</p>

<!-- Font weight -->
<p class="fw-bold">Bold</p>
<p class="fw-normal">Normal</p>
<p class="fw-light">Light</p>

<!-- Font style -->
<p class="fst-italic">Italic</p>
```

## Lists

```html
<ul class="list-unstyled">
  <li>Item without bullets</li>
  <li>Another item</li>
</ul>

<ul class="list-inline">
  <li class="list-inline-item">Inline item 1</li>
  <li class="list-inline-item">Inline item 2</li>
  <li class="list-inline-item">Inline item 3</li>
</ul>
```

## Blockquote

```html
<figure>
  <blockquote class="blockquote">
    <p>A well-known quote.</p>
  </blockquote>
  <figcaption class="blockquote-footer">
    Someone famous in <cite title="Source Title">Source Title</cite>
  </figcaption>
</figure>
```

---

## Interview Questions

**Q: What is the difference between `<h1>` and `<h1 class="display-1">`?**
A: `<h1>` renders at 2.5rem with normal heading weight. `display-1` has a larger font size (5rem) with lighter font weight for hero sections.

**Q: How do you create an inline list without bullets in Bootstrap?**
A: Use `.list-inline` on the `<ul>` and `.list-inline-item` on each `<li>`. This removes bullets and displays items horizontally.

**Q: How do you prevent text from wrapping in Bootstrap?**
A: Use `.text-nowrap` class. It applies `white-space: nowrap` to keep the text on a single line.

**Q: What does `.text-truncate` do?**
A: It truncates text with an ellipsis (...) when the text overflows its container. Requires `display: block` or `inline-block`.
