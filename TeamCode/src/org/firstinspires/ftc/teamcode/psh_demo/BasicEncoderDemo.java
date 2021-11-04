package org.firstinspires.ftc.teamcode.psh_demo;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Encoder Test",group="PSH Demo")
public class BasicEncoderDemo extends LinearOpMode {

    public void runOpMode() {

        DcMotor leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        DcMotor rightMotor = hardwareMap.get(DcMotor.class, "right_motor");

        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.FORWARD);

        int leftMotorPosition = leftMotor.getCurrentPosition();
        int numTicks = 5000;

        while (leftMotorPosition < numTicks) {
            leftMotor.setPower(1);
            rightMotor.setPower(1);
            leftMotorPosition = leftMotor.getCurrentPosition();
        }

        leftMotor.setPower(0);
        rightMotor.setPower(0);

        telemetry.addData("Left Position", leftMotorPosition);
        telemetry.update();
    }
}
