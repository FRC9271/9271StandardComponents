package frc.robot;
import com.revrobotics.CANSparkMax.FaultID;

//like RobotToggles but for numbers that I would prefer to keep all in one place(may add shuffleboard stuff later)
public class RobotNumbers{
    //put all your numbers here, like gear ratios or control deadzones
    
    //public static final double [NAME] = [VALUE];
    //public static final double maxHeight = 40; <-- EXAMPLE

    //junk for motor debug code, change names if needed
    public static final String[] sparkErrors = {"Brownout", "Overcurrent", "IWDTReset", "MotorFault", "SensorFault", "Stall", "EEPROMCRC", "CANTX", "CANRX", "HasReset", "DRVFault", "OtherFault"};
    public static final FaultID[] sparkErrorIDs = {FaultID.kBrownout, FaultID.kOvercurrent, FaultID.kIWDTReset, FaultID.kMotorFault, FaultID.kSensorFault, FaultID.kStall, FaultID.kEEPROMCRC, FaultID.kCANTX, FaultID.kCANRX, FaultID.kHasReset, FaultID.kDRVFault, FaultID.kOtherFault};
}