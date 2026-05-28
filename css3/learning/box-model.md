# CSS3 Box Model

Every HTML element is a rectangular box. The CSS box model describes the structure:

```
+---------------------------+
|        MARGIN             |
|  +---------------------+  |
|  |      BORDER         |  |
|  |  +---------------+  |  |
|  |  |    PADDING    |  |  |
|  |  |  +---------+  |  |  |
|  |  |  | CONTENT |  |  |  |
|  |  |  +---------+  |  |  |
|  |  +---------------+  |  |
|  +---------------------+  |
+---------------------------+
```

**From inside out:** Content → Padding → Border → Margin

## Content

The area where text and images appear.

```css
div {
  width: 300px;
  height: 150px;
}
```

- `width` and `height` set the **content area** size (by default)

## Padding

Clears area **around** the content. Transparent.

```css
/* All sides */
padding: 20px;

/* Individual sides */
padding-top: 10px;
padding-right: 15px;
padding-bottom: 10px;
padding-left: 15px;

/* Shorthand: top right bottom left (clockwise) */
padding: 10px 15px 10px 15px;

/* Shorthand: top/bottom left/right */
padding: 10px 15px;
```

## Border

A border around the padding and content.

```css
/* Border style (required) */
border-style: solid;
border-style: dotted;
border-style: dashed;
border-style: double;
border-style: groove;
border-style: ridge;
border-style: inset;
border-style: outset;
border-style: none;

/* Border width */
border-width: 5px;
border-width: thin medium thick;

/* Border color */
border-color: red;

/* Shorthand */
border: 5px solid red;

/* Individual sides */
border-top: 2px dashed blue;
border-right: 3px dotted green;

/* Rounded corners */
border-radius: 10px;
border-radius: 10px 5px 10px 5px;  /* top-left top-right bottom-right bottom-left */
```

## Margin

Clears area **outside** the border. Transparent.

```css
/* All sides */
margin: 20px;

/* Individual sides */
margin-top: 10px;
margin-right: auto;
margin-bottom: 20px;
margin-left: auto;

/* Shorthand (same pattern as padding) */
margin: 10px 15px 10px 15px;
margin: 10px 15px;
```

### Auto Margin (Center block elements)

```css
div {
  width: 50%;
  margin: 0 auto;
}
```

### Margin Collapse

- Top/bottom margins of adjacent elements collapse (the larger margin wins)
- Top/bottom margins of parent/child can collapse too
- Left/right margins never collapse

```css
/* These two boxes will have 30px gap, not 50px (max wins) */
.box1 { margin-bottom: 30px; }
.box2 { margin-top: 20px; }
/* Result: 30px gap */
```

## Total Width Calculation

**Default (content-box):**

```
Total width  = width + left-padding + right-padding + left-border + right-border
Total height = height + top-padding + bottom-padding + top-border + bottom-border
```

**Margin is NOT included** in the element's total size, only in the space it occupies.

Example:

```css
div {
  width: 320px;
  padding: 10px;
  border: 5px solid gray;
  margin: 20px;
}
/* Total width = 320 + 10 + 10 + 5 + 5 = 350px */
/* Margin adds 20px on each side, but is not part of element size */
```

### Box-Sizing

Changes how total width/height is calculated:

```css
/* Default: width/height excludes padding+border */
box-sizing: content-box;

/* width/height INCLUDE padding+border */
box-sizing: border-box;
```

With `border-box`:

```css
div {
  width: 320px;
  padding: 10px;
  border: 5px solid gray;
  /* Content width = 320 - 20 - 10 = 290px */
  box-sizing: border-box;
}
```

## Outline

A line drawn **outside** the border (not part of the box model, overlaps margin):

```css
outline-style: solid;
outline-width: 5px;
outline-color: red;

/* Shorthand */
outline: 5px solid red;

/* Offset (space between border and outline) */
outline-offset: 5px;
```

- Outline does NOT affect element size or position
- Outline is NOT part of the box model
- Can be non-rectangular

## Display Property

Controls **how** an element is displayed:

```css
display: block;          /* takes full width, starts new line */
display: inline;         /* fits in text flow, no width/height */
display: inline-block;   /* inline but can have width/height/padding */
display: none;           /* element NOT rendered (removed from flow) */
display: flex;           /* flexbox container */
display: grid;           /* grid container */
display: table;          /* behaves like <table> */
```

## Visibility vs Display

```css
/* Element hidden but STILL takes up space */
visibility: hidden;

/* Element hidden and does NOT take up space */
display: none;

/* Default visible */
visibility: visible;
display: block;
```

## Multi-Column Layout

CSS3 multi-column layout for magazine-style columns:

```css
/* Number of columns */
column-count: 3;

/* Column width */
column-width: 200px;

/* Shorthand */
columns: 3 200px;

/* Gap between columns */
column-gap: 40px;

/* Column separator rule */
column-rule: 2px solid gray;

/* Span element across all columns */
h2 { column-span: all; }
```

Example:

```css
article {
  column-count: 3;
  column-gap: 30px;
  column-rule: 1px solid #ccc;
}
```

## Key Points

- **Content** → **Padding** (inside border) → **Border** → **Margin** (outside)
- Use `box-sizing: border-box` to include padding/border in width
- Margin **collapses** vertically (larger wins), padding does not
- `display: none` removes element from flow; `visibility: hidden` keeps space
- Outline is outside border, does NOT affect layout
- Multi-column splits content into columns like a newspaper
