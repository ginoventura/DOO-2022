/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.vista;

import edu.ubp.doo.main.EjemploMVC;
import javax.swing.JFrame;
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.GenericTypeMatcher;
import org.assertj.swing.core.Robot;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.finder.WindowFinder;
import org.assertj.swing.fixture.FrameFixture;
import static org.assertj.swing.launcher.ApplicationLauncher.application;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author agustin
 */
public class CalculadoraJFrameTest {

    private FrameFixture window;
    Robot robot;

    public CalculadoraJFrameTest() {

    }

    @BeforeClass
    public static void setUpClass() {
        FailOnThreadViolationRepaintManager.install();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
//    SimpleCopyApplication frame = GuiActionRunner.execute(() -> new SimpleCopyApplication());
//    window = new FrameFixture(frame);
//    window.show(); 
        robot = BasicRobot.robotWithNewAwtHierarchy();
        application(EjemploMVC.class).start();
        GenericTypeMatcher<JFrame> matcher = new GenericTypeMatcher<JFrame>(JFrame.class) {
            @Override
            protected boolean isMatching(JFrame frame) {
                return frame.getTitle() != null && frame.getTitle().startsWith("Calculadora") && frame.isShowing();
            }
        };
        window = WindowFinder.findFrame(matcher).using(robot);
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }

    /**
     * Test of setControlador method, of class CalculadoraJFrame.
     */
    @Test
    public void testSumar() {

        window.textBox("txtNumero1").enterText("1");
        window.textBox("txtNumero2").enterText("2");
        window.button("btnSumar").click();
        window.textBox("txtResultado").requireText("3");
//        assertThat(window.textBox("txtResultado").text(), is("3"));
    }

    @Test
    public void testRestar() {

        window.textBox("txtNumero1").enterText("1");
        window.textBox("txtNumero2").enterText("2");
        window.button("btnRestar").click();
        window.textBox("txtResultado").requireText("-1");
//        assertThat(window.textBox("txtResultado").text(), is("-1"));
    }

}
