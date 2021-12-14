package pckgPaciente;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.ComboPopup;

public class ComboCustomUI extends BasicComboBoxUI {

    @Override
    public void installUI(JComponent jc) {
        super.installUI(jc);
        Border border = new Border();
        comboBox.setBackground(Color.decode("#CEF8E9"));
        comboBox.setBorder(border);
    }

    @Override
    protected JButton createArrowButton() {
        return new ArrowButton();
    }

    @Override
    protected ComboPopup createPopup() {
        return new ComboSuggestionPopup(comboBox);
    }

    @Override
    protected ListCellRenderer createRenderer() {
        return new ListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {
                String text = e == null ? "" : e.toString();
                JLabel label = new JLabel(text);
                label.setFont(comboBox.getFont());
                if (i >= 0) {
                    label.setBorder(new EmptyBorder(5, 8, 5, 8));
                } else {
                    label.setBorder(null);
                }
                if (bln) {
                    label.setOpaque(true);
                    label.setBackground(Color.decode("#C8CED4"));
                    label.setForeground(Color.BLACK);
                }
                return label;
            }
        };
    }

    @Override
    public void paintCurrentValueBackground(Graphics grphcs, Rectangle rctngl, boolean bln) {
    }

    @Override
    public void update(Graphics g, JComponent c) {
        g.setColor(c.getBackground());
        g.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10);
        paint(g, c);
    }

    private class ComboSuggestionPopup extends BasicComboPopup {

        public ComboSuggestionPopup(JComboBox combo) {
            super(combo);
            setBorder(new Border(0));
        }

        @Override
        protected JScrollPane createScroller() {
            JScrollPane scroll = super.createScroller();
            list.setBackground(Color.decode("#ECFDF7"));
            JScrollBar sb2 = new JScrollBar();
            sb2.setUI(new ModernScrollBarUI());
            sb2.setPreferredSize(new Dimension(8, 8));
            sb2.setForeground(Color.decode("#4BC088"));
            sb2.setBackground(Color.decode("#ECFDF7"));
            sb2.setUnitIncrement(20);
            sb2.setPreferredSize(new Dimension(12, 70));
            scroll.setVerticalScrollBar(sb2);
            return scroll;
        }
    }

    private class ArrowButton extends JButton {

        public ArrowButton() {
            setContentAreaFilled(false);
            setBorder(new EmptyBorder(5, 5, 5, 5));
            setBackground(Color.decode("#4BC088"));
        }

        @Override
        public void paint(Graphics grphcs) {
            super.paint(grphcs);
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth();
            int height = getHeight();
            int sizeX = 16;
            int sizeY = 12;
            int x = (width - sizeX) / 2;
            int y = 2 + (height - sizeY) / 2;

            int px[] = {x, x + sizeX, x + sizeX / 2};
            int py[] = {y, y, y + sizeY};
            g2.setColor(getBackground());
            g2.fillPolygon(px, py, px.length);
            g2.dispose();
        }
    }

    private class Border extends EmptyBorder {

        public Color getFocusColor() {
            return focusColor;
        }

        public void setFocusColor(Color focusColor) {
            this.focusColor = focusColor;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        private Color focusColor = Color.decode("#CEF8E9");
        private Color color = Color.decode("#CEF8E9");

        public Border(int border) {
            super(border, border, border, border);
        }

        public Border() {
            this(0);
        }

        @Override
        public void paintBorder(Component cmpnt, Graphics grphcs, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (cmpnt.isFocusOwner()) {
                g2.setColor(focusColor);
            } else {
                g2.setColor(color);
            }
            g2.drawRoundRect(x, y, width - 1, height - 1, 10, 10);
            g2.dispose();
        }
    }

    public class ModernScrollBarUI extends BasicScrollBarUI {

        private final int THUMB_SIZE = 80;

        @Override
        protected Dimension getMinimumThumbSize() {
            if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
                return new Dimension(0, THUMB_SIZE);
            } else {
                return new Dimension(THUMB_SIZE, 0);
            }
        }

        @Override
        protected JButton createIncreaseButton(int i) {
            return new ScrollBarButton();
        }

        @Override
        protected JButton createDecreaseButton(int i) {
            return new ScrollBarButton();
        }

        @Override
        protected void paintTrack(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        }

        @Override
        protected void paintThumb(Graphics grphcs, JComponent jc, Rectangle rctngl) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int x = rctngl.x;
            int y = rctngl.y;
            int width = rctngl.width - 4;
            int height = rctngl.height;
            if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
                y += 8;
                height -= 16;
            } else {
                x += 8;
                width -= 16;
            }
            g2.setColor(scrollbar.getForeground());
            g2.fillRoundRect(x + 2, y, width, height, 10, 10);
        }

        private class ScrollBarButton extends JButton {

            public ScrollBarButton() {
                setBorder(BorderFactory.createEmptyBorder());
            }

            @Override
            public void paint(Graphics grphcs) {
            }
        }
    }
}
