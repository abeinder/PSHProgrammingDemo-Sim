package org.firstinspires.ftc.teamcode.psh_demo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Servo Demo 2",group="PSH Demo")
public class BasicServoDemo2 extends OpMode {

    private Servo backServo = null;

    public void init() {
        backServo = hardwareMap.servo.get("back_servo");
    }

    public void loop() {

        if (gamepad1.a) {
            backServo.setPosition(1);
        } else if (gamepad1.b) {
            backServo.setPosition(0);
        }

    }
}
