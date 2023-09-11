package com.example.button_exp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ExpandableListView

class MainActivity : AppCompatActivity() {

    private lateinit var expandableListView: ExpandableListView
    private var currentButton: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expandableListView = findViewById(R.id.expandableListViewContainer)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button1.setOnClickListener {
            showExpandableListViewForButton1()
            onButtonClick(button1)

        }

        button2.setOnClickListener {
            showExpandableListViewForButton2()
            onButtonClick(button2)
        }

        button3.setOnClickListener {
            showExpandableListViewForButton3()
            onButtonClick(button3)
        }

        button4.setOnClickListener {
            showExpandableListViewForButton4()
            onButtonClick(button4)
        }

        button5.setOnClickListener {
            showExpandableListViewForButton5()
            onButtonClick(button5)
        }

        button6.setOnClickListener {
            showExpandableListViewForButton6()
            onButtonClick(button6)
        }


    }

    private fun onButtonClick(button: View) {
        if (button != currentButton) {
            // Reset the previously clicked button to the default color
            currentButton?.setBackgroundColor(resources.getColor(R.color.default_button_color))

            // Update the current button and set its color to the clicked_button_color
            currentButton = button
            button.setBackgroundColor(resources.getColor(R.color.clicked_button_color))
        }
    }

    private fun showExpandableListViewForButton1() {
        val groupList = listOf("Shipment info")
        val childList = hashMapOf(
            "Shipment info" to listOf(
                "1. Transit\n" +
                        "\n"+
                        " All successful bookings are shown under the transit link. When the user clicks on the transit link, the following details will be provided to the user:\n" +
                        "\n" +
                        "* All fields marked with * indicates a mandatory field.\n" +
                        "\n" +
                        "* Only the driver app provided by TRANSO can be used for tracking the shipments when the FTL booking will be done with the driver app option.\n" +
                        "\n" +
                        " When the user clicks on the + sign provided next to the shipment id, the view will be displayed the drop wise (consignment) details. The following details will be provided:\n" +
                        "\n" +
                        "* Consignment id\n" +
                        "\n" +
                        "* Drop status\n" +
                        "\n" +
                        "* Destination\n" +
                        "\n" +
                        "* STA (Scheduled Time of Arrival)\n" +
                        "\n" +
                        "* Action\n" +
                        "\n" +
                        "Under the Action column, the user will have the option to:\n" +
                        "\n" +
                        "* View the shipment details. The following information will be displayed\n" +
                        "\n" +
                        "• Customer Name\n" +
                        "\n" +
                        "• Trip Start Time\n" +
                        "\n" +
                        "• Drop Status\n" +
                        "\n" +
                        "• Origin\n" +
                        "\n" +
                        "• Arrival at Origin\n" +
                        "\n" +
                        "• VI.Arrival at Destination\n" +
                        "\n" +
                        "• Material / Product Type\n" +
                        "\n" +
                        "• Vendor / Carrier\n" +
                        "\n" +
                        "• Material Weight\n" +
                        "\n" +
                        "• LR Number\n" +
                        "\n" +
                        "• Material / Product Type\n" +
                        "\n" +
                        "• Quantity\n" +
                        "\n" +
                        "• Vendor / Carrier LR Numbe\n" +
                        "\n" +
                        "• Booking Branch\n" +
                        "\n" +
                        "• Invoice Number\n" +
                        "\n" +
                        "• Booking Type\n" +
                        "\n" +
                        "• Invoice Value\n" +
                        "\n" +
                        "• Booking Time\n" +
                        "\n" +
                        "• E-way Bill Number\n" +
                        "\n" +
                        "• Trip Accepted Time\n" +
                        "\n" +
                        "• TAT(in days)\n" +
                        "\n" +
                        "• Consignee\n" +
                        "\n" +
                        "• Estimated Trip Time\n" +
                        "\n" +
                        "• Consignee Phone\n" +
                        "\n" +
                        "• Approximate Trip Distance (KM)\n" +
                        "\n" +
                        "• Consignor\n" +
                        "\n" +
                        "• Consignor Phone\n" +
                        "\n" +
                        "• Loading Time\n" +
                        "\n" +
                        "• Intransit Since\n" +
                        "\n" +
                        "• Option to download the Consignor LR Copy, Account LR Copy, Branch LR Copy, Consignee LR Copy,Print All LR, E-POD Copy, Driver POD\n" +
                        "\n" +
                        "• Carbon emission details of the trip\n" +
                        "\n" +
                        "• If eway number is not provided, then an option to create eway bill is provided.\n" +
                        "\n" +
                        "• If eway number is provided, then an option to cancel eway bill and extend eway bill is provided.\n" +
                        "\n" +
                        "• Track trip\n" +
                        "\n" +
                        "• Complete trip\n" +
                        "\n" +
                        "\n" +
                        "2. Transit LTL\n" +
                        "\n"+
                        "After completing the booking process from the Pending LTL section at the branch,\n" +
                        "you need to click on the shipment information card. From there, select the \"Transit LTL\" option.\n" +
                        "\n" +
                        "By doing so, the number of shipments associated with your booking will become available for further processing and transit.\n" +
                        "\n" +
                        "\n" +
                        "3. Transit FTL\n" +
                        "\n"+
                        "After completion of the FTL booking process from the branch user select Transit FTL you need to click on the shipment information card. From there, select the \"Transit FTL\" option\n" +
                        "By doing so, the number of shipments associated with your booking will become\n" +
                        "available for further processing and transit.\n" +
                        "\n" +
                        "\n" +
                        "4. Pending LTL\n" +
                        "\n"+
                        "Confirmation for all LTL bookings is done under the pending LTL functionality. The user is provided with a list of all the LTL bookings which are not confirmed. Here the user can select the bookings he/she wishes to confirm. The user can choose multiple bookings for confirmation. If the user has not provided the vendor LR number, then the system prompts the user to enter the vendor LR number during confirmation.\n" +
                        "\n" +
                        "The user can search LTL bookings pending for confirmation using the following:\n" +
                        "\n" +
                        "* Sub branch name\n" +
                        "* Customer name\n" +
                        "* Pickup location\n" +
                        "* Vendor\n" +
                        "The following details are displayed under the list of all pending bookings\n" +
                        "* LR number\n" +
                        "* Customer name\n" +
                        "* Origin\n" +
                        "* Destination\n" +
                        "* Req. Booking Date & Time\n" +
                        "* Vendor LR No./ Docket No\n" +
                        "* Add Venor LR\n" +
                        "* Vendor name\n" +
                        "* Action\n" +
                        "•  View. Under this functionality the following details will be displayed\n" +
                        "   • Source\n" +
                        "   • Destination\n" +
                        "   • Vendor Name\n" +
                        "   • Vendor LR Number\n" +
                        "   • Customer\n" +
                        "   • SKU Code\n" +
                        "   • Carton Code\n" +
                        "   • Material Type\n" +
                        "   • No. of Boxes\n" +
                        "   • Loading Charge\n" +
                        "   • Unloading Charge\n" +
                        "   • Other Charge\n" +
                        "   • Weight\n" +
                        "   • Actual Weight\n" +
                        "   • Volumetric Weight\n" +
                        "   • Invoice Numbers\n" +
                        "   • E-way Bill Numbers\n" +
                        "   • Consignor\n" +
                        "   • Consignee\n" +
                        "   • Consignor Phone\n" +
                        "   • Consignee Phone\n" +
                        "   • Consignor GSTIN\n" +
                        "   • Consignee GSTIN\n" +
                        "   • Add / View E-Way Bill Details\n" +
                        "   • Add Additional Charges\n" +
                        "\n" +
                        "\n" +

                        "5. Pending POD(proof of delivery)\n" +
                        "\n"+
                        "The trips in which the vehicles have reached the destination but POD documents are not uploaded under the Pending closure link. When the user clicks on the pending closure link the following details will be displayed:\n" +
                        "* Shipment id\n" +
                        "* Vehicle number with booking type\n" +
                        "* Origin\n" +
                        "* Total drops\n" +
                        "\n" +
                        "When the user clicks on the + sign provided next to the shipment id, the view will be displayed the drop wise (consignment) details. The following details will be provided:\n" +
                        "* Consignment id\n" +
                        "* Trip status\n" +
                        "* Destination\n" +
                        "* Arrival time\n" +
                        "* Action\n" +
                        "\n" +
                        "Under the Action column, the user will have the option to:\n" +
                        "* View the shipment details. The following information will be displayed\n" +
                        "•  Customer Name\n" +
                        "•  Vehicle number\n" +
                        "•  Trip Start Time\n" +
                        "•  Drop Status\n" +
                        "•  Origin\n" +
                        "•  Destination\n" +
                        "•  Arrival at Origin\n" +
                        "•  Arrival at Destination\n" +
                        "•  Material / Product Type\n" +
                        "•  Vendor / Carrier\n" +
                        "•  Material Weight\n" +
                        "•  Vendor / Carrier LR Number\n" +
                        "•  Quantity\n" +
                        "•  SKU Code\n" +
                        "•  Booking Branch\n" +
                        "•  No of Boxes\n" +
                        "•  Booking Type\n" +
                        "•  LR Number\n" +
                        "•  Booking Time\n" +
                        "•  Vendor / Carrier\n" +
                        "•  Trip Accepted Time\n" +
                        "•  Invoice Number\n" +
                        "•  Consignee\n" +
                        "•  Invoice Value\n" +
                        "•  Consignee Phone\n" +
                        "•  TAT(in days)\n" +
                        "•  Consignor\n" +
                        "•  Trip Time\n" +
                        "•  Consignor Phone\n" +
                        "•  Trip Distance (KM)\n" +
                        "•  Consignee GSTIN number\n" +
                        "•  Remarks\n" +
                        "•  Loading charges\n" +
                        "•  Loading Time\n" +
                        "•  Unloading charges\n" +
                        "•  Transit Time\n" +
                        "•  Other charges\n" +
                        "•  Unloading Time\n" +
                        "•  Option to download the Consignor LR Copy, Account LR Copy, Branch LR Copy, Consignee LR Copy,Print All LR, E-POD Copy, Driver POD\n" +
                        "   * Track trip\n" +
                        "   * Close trip\n" +
                        "   * Upload files\n" +
                        "\n" +
                        "\n" +
                        "6. Completed\n" +
                        "\n"+
                        "When the user clicks on the Completed link, the following details will be provided to the user:\n" +
                        "* Shipment id\n" +
                        "* Vehicle number with booking type\n" +
                        "* Origin\n" +
                        "* Total drops\n" +
                        "\n" +
                        "When the user clicks on the + sign provided next to the shipment id, the view will be displayed the drop wise (consignment) details. The following details will be provided:\n" +
                        "* Consignment id\n" +
                        "* Destination\n" +
                        "* Trip status\n" +
                        "* Date\n" +
                        "* Action\n" +
                        "\n" +
                        "Under the Action column, the user will have the option to:\n" +
                        "* View the shipment details. The following information will be displayed\n" +
                        "   • Customer Name\n" +
                        "   •  Vehicle number\n" +
                        "   •  Trip Start Time\n" +
                        "   •  Drop Status\n" +
                        "   •  Origin\n" +
                        "   •  Destination\n" +
                        "   •  Arrival at Origin\n" +
                        "   •  Arrival at Destination\n" +
                        "   •  Material / Product Type\n" +
                        "   •  Vendor / Carrier\n" +
                        "   •  Material Weight\n" +
                        "   • Vendor / Carrier LR Number\n" +
                        "   • Quantity\n" +
                        "   • SKU Code\n" +
                        "   • Booking Branch\n" +
                        "   • No of Boxes\n" +
                        "   • Booking Type\n" +
                        "   • LR Number\n" +
                        "   • Booking Time\n" +
                        "   • Vendor / Carrier\n" +
                        "   • Trip Accepted Time\n" +
                        "   • Invoice Number\n" +
                        "   • Consignee\n" +
                        "   • Invoice Value\n" +
                        "   • Consignee Phone\n" +
                        "   • TAT(in days)\n" +
                        "   • Consignor\n" +
                        "   • Trip Time\n" +
                        "   • Consignor Phone\n" +
                        "   • Trip Distance (KM)\n" +
                        "   • Consignee GSTIN number\n" +
                        "   • Remarks\n" +
                        "   • Loading charges\n" +
                        "   • Loading Time\n" +
                        "   • Unloading charges\n" +
                        "   • Transit Time\n" +
                        "   • Other charges\n" +
                        "   • Unloading Time\n" +
                        "   • Option to download the Consignor LR Copy, Account LR Copy, Branch LR Copy, Consignee LR Copy,Print All LR, E-POD Copy, Driver POD\n" +
                        "   • Carbon emission details of the trip\n" +
                        "   • Track trip\n" +
                        "   • Add remarks"
            )
        )
        val adapter = ExpandableListAdapter(this, groupList, childList)
        expandableListView.setAdapter(adapter)
    }

    private fun showExpandableListViewForButton2() {
        val groupList = listOf(
            "How to make a FTL booking using the driver app?",
            "How to make FTL booking with GPS",
            "How to make FTL booking with SIM",
            "How to make FTL booking with manual"
        )
        val childList = hashMapOf(
            "How to make a FTL booking using the driver app?" to listOf(
                "Note: \n" +
                    "\n"+
                    "*  All fields marked with * indicates a mandatory field.\n" +
                    "\n"+
                    "*  Only the driver app provided by TRANSO can be used for tracking the shipments when the FTL booking will be done with the driver app option.\n" +
                    "\n"+
                    "• Pre-conditions\n" +
                    "*  The driver should be logged in to the driver app.\n" +
                    "\n"+
                    "*  The driver should not be off duty.\n" +
                    "\n"+
                    "*  The driver should not be assigned to any shipments.\n" +
                    "\n"+
                    "*  The customer and vendor commercials should be available for the pickup and drop locations of the booking.\n" +
                    "\n"+
                    "Step 1. \n" +
                    "* Select the branch/subrach from the dropdown\n" +
                    "\n"+
                    "Step 2.\n " +
                    "* Select customer from the drop down\n" +
                    "\n"+
                    "Step 3.\n " +
                    "* Select vehicle type from the drop down\n" +
                    "\n"+
                    "Step 4.\n " +
                    "* Select the vendor from the drop down\n" +
                    "\n"+
                    "Step 5.\n " +
                    "* Select the pick up from location from the drop down\n" +
                    "\n"+
                    "Step 6.\n " +
                    "* Select the drop at location from the drop down\n" +
                    "\n"+
                    "Step 7. \n" +
                    " * The user will be directed to the consignee details page\n" +
                    "\n"+
                    " * Choose the type of LR from the radio button\n" +
                    "\n"+
                    " * LR type: Pregenerated, Manual, Auto\n" +
                    "\n"+
                    " * Enter the vendor LR number (Non mandatory)\n" +
                    "\n"+
                    " * Select material type from the drop down\n" +
                    "\n"+
                    " * Provide the material description (Non mandatory)\n" +
                    "\n"+
                    " * Enter the number of packages\n" +
                    "\n"+
                    " * The user can select the type of weight\n" +
                    "\n"+
                    "I.Select weight in kg\n" +
                    "\n"+
                    "a. Enter the weight in kilograms\n" +
                    "\n"+
                    "II.Select volumetric weight\n" +
                    "\n"+
                    "a. Enter the length, breadth and height\n" +
                    "\n"+
                             "     * Enter the vendor rate\n" +
                             "     * the customer rate\n" +
                             "     * Enter TAT (Turn Around Time)\n" +
                             "     * Click on enter invoice number\n" +
                    "\n"+
                    "I.   Enter the invoice number\n" +
                    "\n"+
                    "II.  Enter the invoice value\n" +
                    "\n"+
                    "II.  Enter the invoice date \n" +
                    "         Click on e-waybill number\n" +
                    "\n"+
                    "I.   Enter the e-way bill number\n" +
                    "\n"+
                    "II.  Enter from date\n" +
                    "\n"+
                    "III. Enter to date\n" +
                    "\n"+
                    "Step 8. \n " +
                    "Choose the available vehicles from the drop down\n" +
                    "\n"+
                    "Step 9.\n " +
                    "Click on book now\n" +
                    "\n"+
                    "Step 10.\n " +
                    "If the shipment has multiple drops add the drop details by clicking on “drop at “ field.\n" +
                    "\n"+
                    "Step 11. Click on submit button to complete the booking",
            ),
            "How to make FTL booking with GPS" to listOf(
                "This type of booking will be available for tracking GPS devices. TRANSO has the capability to integrate with most of the GPS service providers.\n" +
                    "• Pre-conditions\n" +
                    "  * The GPS devices have to be integrated on the TRANSO application.\n" +
                    "  * The customer and vendor commercials should be available for the pickup and drop locations of the booking.\n" +
                        "\n"+
                    "Step 1.\n " +
                    "  • Select the branch/subrach from the dropdown\n" +
                    "Step 2.\n " +
                    "  • Select customer from the drop down\n" +
                    "Step 3. \n" +
                    "  • Select vehicle type from the drop down\n" +
                    "Step 4. \n" +
                    "  • Select the vendor from the drop down\n" +
                    "Step 5.\n " +
                    "  • Select the pick up from location from the drop down.\n" +
                    "Step 6.\n " +
                    "   Select the drop at location from the drop down.\n" +
                    "     • The user will be directed to the consignee details page\n" +
                    "     • Choose the type of LR from the radio button\n" +
                    "     • LR type: Pregenerated, Manual, Auto\n" +
                    "     • Enter the vendor LR number (Non mandatory)\n" +
                    "     • Select material type from the drop down\n" +
                    "     • Provide the material description (Non mandatory)\n" +
                    "     • Enter the number of packages\n" +
                    "     •  The user can select the type of weight\n" +
                        "\n"+
                    "I. Select weight in kg\n" +
                    "        a. Enter the weight in kilograms\n" +
                    "\n"+
                    "II.Select volumetric weight\n" +
                        "    a. Enter the length, breadth and height\n" +
                    "           Enter the vendor rate\n" +
                    "           Enter the customer rate\n" +
                    "           Enter TAT (Turn Around Time)\n" +
                        "\n"+
                    "* Click on enter invoice number\n" +
                    "I.  Enter the invoice number\n" +
                    "II. Enter the invoice value\n" +
                    "II. Enter the invoice date\n" +
                        "\n"+
                    " *Click on e-waybill number\n" +
                    "  I.  Enter the e-way bill number\n" +
                    "  II. Enter from date\n" +
                    "  II. Enter to date\n" +
                    "• Choose the available vehicles from the drop down\n" +
                    "     • Click on book now\n" +
                    "     • If the shipment has multiple drops add the drop details by clicking on the “drop at “ field.\n" +
                    "     • Click on submit button to complete the booking"
            ),
            "How to make FTL booking with SIM" to listOf(
                "For SIM based tracking the SIM numbers of the drivers will be used for tracking.\n" +
                    "\n"+
                        "* Pre-conditions\n" +
                    "   • The driver should give consent to track his/her mobile number via SMS.\n" +
                    "   • The ping from the mobile number should not be older than 30 mins from the time of booking.\n" +
                    "   • The customer and vendor commercials should be available for the pickup and drop locations of the booking.\n" +
                        "\n"+
                    "Step 1.  Select the branch/subrach from the dropdown\n" +
                    "Step 2.  Select customer from the drop down\n" +
                    "Step 3.  Select vehicle type from the drop down\n" +
                    "Step 4.  Select the vendor from the drop down\n" +
                    "Step 5.  Select the pick up from location from the drop down.\n" +
                    "Step 6.  Select the drop at location from the drop down.\n" +
                    "The user will be directed to the consignee details page\n" +
                    "   • Choose the type of LR from the radio button\n" +
                    "   • LR type: Pregenerated, Manual, Auto\n" +
                    "   • Enter the vendor LR number (Non mandatory)\n" +
                    "   • Select material type from the drop down\n" +
                    "   • Provide the material description (Non mandatory)\n" +
                    "   • Enter the number of packages\n" +
                    "   • The user can select the type of weight\n" +
                    "           I.Select weight in kg\n" +
                    "                  a. Enter the weight in kilograms\n" +
                    "           II.Select volumetric weight\n" +
                    "                  a. Enter the length, breadth and height\n" +
                    "   • Enter the vendor rate\n" +
                    "   • Enter the customer rate\n" +
                    "   • Enter TAT (Turn Around Time)\n" +
                    "   • Click on enter invoice number\n" +
                    "       I.Enter the invoice number\n" +
                    "       II.Enter the invoice value\n" +
                    "       III.Enter the invoice date\n" +
                    "   • Click on e-waybill number\n" +
                    "       I.Enter the e-way bill number\n" +
                    "       II.Enter from date\n" +
                    "       III.Enter to date\n" +
                    "   • Choose the available vehicles from the drop down\n" +
                    "   •  Click on book now\n" +
                    "   • If the shipment has multiple drops add the drop details by clicking on the “drop at “ field.\n" +
                    "   • Click on submit button to complete the booking"
            ),
            "How to make FTL booking with manual" to listOf(
                "When there are no options to track the vehicle, the user can update the status of such trips manually.\n" +
                        "\n"+
                    "Pre-conditions\n" +
                        "\n"+
                    "     • The customer and vendor commercials should be available for the pickup and drop locations of the booking.\n" +
                    "Step 1. Select the branch/subrach from the dropdown\n" +
                    "Step 2. Select customer from the drop down\n" +
                    "Step 3. Select vehicle type from the drop down\n" +
                    "Step 4. Select the vendor from the drop down\n" +
                    "Step 5. Select the pick up from location from the drop down.\n" +
                    "Step 6. Select the drop at location from the drop down.\n" +
                    "The user will be directed to the consignee details page\n" +
                    " • Choose the type of LR from the radio button\n" +
                    " • LR type: Pregenerated, Manual, Auto\n" +
                    " • Enter the vendor LR number (Non mandatory)\n" +
                    " • Select material type from the drop down\n" +
                    " • Provide the material description (Non mandatory)\n" +
                    " • Enter the number of packages\n" +
                    " The user can select the type of weight\n" +
                    "    I.Select weight in kg\n" +
                    "       a. Enter the weight in kilograms\n" +
                    "    II.Select volumetric weight\n" +
                    "       a. Enter the length, breadth and height\n" +
                    " • Enter the vendor rate\n" +
                    " • Enter the customer rate\n" +
                    " • Enter TAT (Turn Around Time)\n" +
                    " • Click on enter invoice number\n" +
                    "     I.Enter the invoice number\n" +
                    "     II.Enter the invoice value\n" +
                    "     II.Enter the invoice date\n" +
                    " • Click on e-waybill number\n" +
                    "    I.Enter the e-way bill number\n" +
                    "    II.Enter from date\n" +
                    "    II.Enter to date\n" +
                    " • Choose the available vehicles from the drop down\n" +
                    " • Select the driver from the drop down\n" +
                    " • Click on book now\n" +
                    " • If the shipment has multiple drops add the drop details by clicking on the “drop at “ field.\n" +
                    " • Click on submit button to complete the booking")
        )
        val adapter = ExpandableListAdapter(this, groupList, childList)
        expandableListView.setAdapter(adapter)
    }

    private fun showExpandableListViewForButton3() {
        val groupList = listOf("How to make a FTL booking (*indicates mandatory field)")
        val childList = hashMapOf(
            "How to make a FTL booking (*indicates mandatory field)" to listOf(
                "Step 1. Select Booking\n" +
                        "\n"+
                        "Step 2. Select Contract Booking\n" +
                        "\n"+
                        "Step 3. Choose booking type\n" +
                        "\n"+
                        "Step 4. Choose tracking type\n" +
                        "\n"+
                        "Step 5. Booking flow\n" +
                        "\n"+
                        "Step 6. Click on Submit.\n" +
                        "\n"+
                        "Step 7.  Select the vehicle from the drop down\n" +
                        "\n"+
                        "Step 8. Click on book now\n" +
                        "\n"+
                        "Note: Users can add multiple drops using the same vehicle. Our system supports the ability to schedule and manage multiple drop-off locations for a single vehicle."

            )
        )
        val adapter = ExpandableListAdapter(this, groupList, childList)
        expandableListView.setAdapter(adapter)
    }

    private fun showExpandableListViewForButton4() {
        val groupList = listOf("How to make a FTL booking (*indicates mandatory field)")
        val childList = hashMapOf(
            "How to make a FTL booking (*indicates mandatory field)" to listOf(
                "Step 1. Select Booking\n" +
                        "\n"+
                        "Step 2. Select Contract Booking\n" +
                        "\n"+
                        "Step 3. Choose booking type\n" +
                        "\n"+
                        "Step 4. Choose tracking type\n" +
                        "\n"+
                        "Step 5. Booking flow\n" +
                        "\n"+
                        "Step 6. Click on Submit.\n" +
                        "\n"+
                        "Step 7.  Select the vehicle from the drop down\n" +
                        "\n"+
                        "Step 8. Click on book now\n" +
                        "\n"+
                        "Note: Users can add multiple drops using the same vehicle. Our system supports the ability to schedule and manage multiple drop-off locations for a single vehicle."


            ),
        )
        val adapter = ExpandableListAdapter(this, groupList, childList)
        expandableListView.setAdapter(adapter)
    }

    private fun showExpandableListViewForButton5() {
        val groupList = listOf(
            "How to Add a Branch?",
            "How to add a Sub-Branch?",
            "How to add a Customer?",
            "How to add a Sub Customer?",
            "How do I generate or get pre generated LRs / LR No’s",
            "How to add a vendor?",
            "How to add a Vehicle?",
            "How to add a driver?",
            "How do I assign a driver?",
            )
        val childList = hashMapOf(
            "How to Add a Branch?" to listOf(
                        "Step 1. Click on the Administration menu item on the dashboard\n" +
                                "\n"+
                        "Step 2.  Click on the Branch sub menu\n" +
                                "\n"+
                        "Step 3. Click on Add Branch\n" +
                                "\n"+
                        "Step 4. Add all details for the branch\n" +
                        "           • The branch code should be unique\n" +
                        "           • If an individual branch GSTIN is not available, you can use any desired GSTIN for a branch as approved by your organisation or branch administrator.\n" +
                        "           • The branch PAN is automatically populated from the GSTIN details.\n" +
                        "           • The branch address is the postal address of the branch.\n" +
                                "\n"+
                        "Step 5. Click on Submit.\n" +
                                "\n"+
                                "Step 6. A success message is displayed. If there are errors, you can correct the errors and Submit again. If you want to cancel the branch addition, simply click on the Cancel button.\n" +
                                "\n"+
                                "Note: The branch can also be your fulfilment centre or distribution centre.",
                            ),


            "How to add a Sub-Branch?" to listOf(

                        "Step 1. Click on the Administration menu item on the dashboard\n" +
                                "\n"+
                        "Step 2. Click on the Branch sub menu\n" +
                                "\n"+
                        "Step 3. The list of onboarded branches is displayed\n" +
                                "\n"+
                        "Step 4. Click on the + button under the action column against the branch for which you need to add a sub-branch\n" +
                                "\n"+
                        "Step 5. Add all details for the sub branch as required\n" +
                        " • Enter the sub branch name\n" +
                        " • Enter the sub branch postal address\n" +
                        " • Enter the postal code\n" +
                        " • The state and city are automatically populated based on the postal code\n" +
                        " • Choose the desired location name. If you do not see the location name, you should request your administrator to add the location name in the location master.\n" +
                        " • You have to mandatorily mark the exact sub branch location on the map to make bookings. If you do not find the location on the map, please use the marker on the map to drag and drop to mark the precise location.\n" +
                        " • A success message is displayed. If there are errors, you can correct the errors and Submit again.\n" +
                                "\n"+
                        "Step 6. Click on Submit.\n" +
                                "\n"+
                        "Step 7.  A success message is displayed. If there are errors, you can correct the errors and Submit again",
            ),

            "How to add a Customer?" to listOf(
                "Step 1. Click on the Administration menu item on the dashboard\n" +
                        "\n"+
                        "Step 2. Click on the Customer sub menu\n" +
                        "\n"+
                        "Step 3. Click on Add Customer.\n" +
                        "\n"+
                        "Step 4. Enter a valid GSTIN number of the customer.\n" +
                        " • If the Automatic Verification radio button is selected, the GSTIN is automatically verified with the GSTIN portal on click of the validate button and a few of the details related to the company are auto populated. The rest of the details have to be manually entered.\n" +
                        " • If the Manual Entry radio button is selected, you will have to enter all of the details manually.\n" +
                        " • Please exercise extreme caution during manual data entry for correctness of the data entered.\n" +
                        "\n"+
                        "Step 5. If you are unable to see the required data in the drop down lists on the page, please contact your administrator for assistance or addition of the required data.\n" +
                        "\n"+
                        "Step 6. Click on Submit\n" +
                        "\n"+
                        "Note: A success message is displayed. If there are errors, you can correct the errors and Submit again.",
            ),

            "How to add a Sub Customer?" to listOf(

                "Note:  A sub customer can mean any of the following as defined by your company;\n" +
                        "•  Sub Customer\n" +
                        "•  Consignor\n" +
                        "•  Consignee\n" +
                        "\n"+
                        "Step 1. Click on the Administration menu item on the dashboard\n" +
                        "\n"+
                        "Step 2. Click on the Customer sub menu\n" +
                        "\n"+
                        "Step 3. The list of on boarded customers is displayed\n" +
                        "\n"+
                        "Step 4. Click on the + button under the action column against the Customer/Company name for which you need to add a sub customer\n" +
                        "\n"+
                        "Note: A sub customer refers to the actual address of the drop location (Destination) or pick up location (Origin)\n" +
                        "\n"+
                        "Step 5. Enter the sub customer code\n" +
                        "\n"+
                        "Step 6. Enter the code created date\n" +
                        "\n"+
                        "Step 7. If the Automatic Verification radio button is selected, the GSTIN is automatically verified with the GSTIN portal on click of the validate button and a few of the details related to the sub customer are auto populated. The rest of the details have to be manually entered.\n" +
                        "If the Manual Entry radio button is selected, you will have to enter all of the details manually.\n" +
                        "Please exercise extreme caution during manual data entry for correctness of the data entered.\n" +
                        "\n"+
                        "Step 8.  You have to mandatorily mark the exact delivery or pickup location on the map to make bookings. If you do not find the location on the map, please use the marker on the map to drag and drop to mark the precise location.\n" +
                        "\n"+
                        "Step 9. Click on Submit\n" +
                        "\n"+
                        "Note: A success message is displayed. If there are errors, you can correct the errors and Submit again",
            ),

            "How do I generate or get pre generated LRs / LR No’s" to listOf(
                        "Step 1. Click on the administration menu item from dashboard\n" +
                        "\n"+
                        "Step 2. Click on LR Generation sub menu\n" +
                                "\n"+
                        "Step 3. Choose the customer name from the dropdown for whom the LRs have to be generated\n" +
                                "\n"+
                        "Step 4.  Choose the Location / Branch / Sub branch for which the LRs have to be aligned from the dropdown.\n" +
                                "\n"+

                        "Step 5. Enter no of LR’s to be generated between 1 to 10 nos only\n" +
                                "\n"+
                        "Step 6. Click on Submit\n" +
                       "\n"+
                        "Step 7. A success message is displayed\n" +
                                "\n"+

                        "Step 8. The pre generated LRs can be accessed from the Pre generated LRs list against a customer by choosing the customer name from the drop down.\n" +
                                "\n"+
                        "Step 9. You can export the LRs in .xlsx format using the Export button"
            ),


            "How to add a vendor?" to listOf(
                        "Step 1. Click the Administration menu item on the dashboard\n" +
                                "\n"+
                        "Step 2. Click on the Vendor, Vehicle, Driver sub menu\n" +
                                "\n"+
                        "Step 3. Click on the Vendor Tab and Add Vendor button\n" +
                                "\n"+
                        "Step 4. Add all details for the vendor manually.\n" +
                                "\n"+
                        "Step 5. Click on Submit.\n" +
                                "\n"+
                        "Step 6. A success message is displayed. If there are errors, you can correct the errors and Submit again."
            ),


            "How to add a Vehicle?" to listOf(
                        "Step 1. Click the Administration menu item on the dashboard\n" +
                                "\n"+
                        "Step 2. Click on the Vendor, Vehicle, Driver sub menu\n" +
                                "\n"+
                        "Step 3. Click on the Vehicle tab and Add Vendor button\n" +
                                "\n"+
                        "Step 4. Select Own Vehicle / Vendor Vehicle\n" +
                                "\n"+
                        "Step 5. Select the tracking type desired for the vehicle among the following;\n" +
                        "            •  Driver App\n" +
                        "            •  GPS Tracker\n" +
                        "            •  Sim Tracking\n" +
                        "            • The branch address is the postal address of the branch.\n" +
                                "\n"+
                        "Step 6. Enter the Vehicle Registration number\n" +
                                "\n"+
                        "Step 7. If the Automatic Verification radio button is selected, the vehicle is automatically verified with the Vaahan / mParivaahan portal on click of the validate button and a few of the details related to the vehicle are auto populated. The unfilled data fields have to be manually entered.\n" +
                        "               •   If the Manual Entry radio button is selected, you will have to enter all of the details manually.\n" +
                        "               •      Please exercise extreme caution during manual data entry for correctness of the data entered.\n" +
                        "               •  Select permit type of the vehicle from the drop down\n" +
                        "               •  Click Next to proceed to the next page of vehicle details\n" +
                        "               •   Upload all the vehicle documents in png, jpg, jpeg formats only\n" +
                        "               •   The document start and end dates are auto populated\n" +
                                "\n"+
                        "Step 8. Click on submit\n" +
                                "\n"+
                        "Step 9. A success message is displayed If there are errors, you can correct the errors and Submit again."
            ),


            "How to add a driver?" to listOf(
                        "Step 1. Click the Administration menu item on the dashboard\n" +
                                "\n"+
                        "Step 2.  Select the Vendor, Vehicle, Driver sub menu\n" +
                                "\n"+
                        "Step 3. Click on the Driver tab and Add Driver button.\n" +
                                "\n"+
                        "Step 4. Click on the Driver tab and Add Driver button.\n" +
                                "\n"+
                        "Step 5. Select Own Driver / Vendor Driver.\n" +
                                "\n"+
                        "Step 6. If the Automatic Verification radio button is selected, the driver is automatically verified with the Saarathi portal on click of the validate button and a few of the details are auto populated. The unfilled data fields have to be manually entered.\n" +
                        "              •   If the Manual Entry radio button is selected, you will have to enter all of the details manually.\n" +
                        "              •   Please exercise extreme caution during manual data entry for correctness of the data entered.\n" +
                                "\n"+
                        "Step 7. Enter the driver's Date of Birth (DOB) and Driver's License (DL) number\n" +
                                "\n"+
                        "Step 8. Upload a copy of the driver DL\n" +
                                "\n"+
                        "Note: The driver mobile number and password are to be provided to the driver to log in to the TRANSO Driver App.\n" +
                                "\n"+
                        "Step 9. Click on Submit.\n" +
                                "\n"+
                        "Note: A success message is displayed. (If there are errors, you can correct the errors and Submit again)"
            ),
            "How do I assign a driver?" to listOf(
                        "Step 1. Click the Administration menu item on the dashboard\n" +
                                "\n"+
                        "Step 2. Select Vendor, Vehicle, Driver sub menu\n" +
                                "\n"+
                        "Step 3. Select Assign driver tab\n" +
                                "\n"+
                        "Step 4. Select Own Driver / Vendor Driver\n" +
                                "\n"+
                        "Step 5. If you select Vendor Driver, then you need to select the Vendor from the dropdown.\n" +
                                "\n"+
                        "Step 6. Select the desired vehicle from the dropdown\n" +
                                "\n"+
                        "Step 7. Click on the Submit button.\n" +
                                "\n"+
                        "Step 8. A success message is displayed."
            ),

            )
        val adapter = ExpandableListAdapter(this, groupList, childList)
        expandableListView.setAdapter(adapter)
    }

    private fun showExpandableListViewForButton6() {
        val groupList = listOf("How to make a FTL booking (*indicates mandatory field)")
        val childList = hashMapOf(
            "How to make a FTL booking (*indicates mandatory field)" to listOf(
                        "Step 1. Select Booking\n" +
                                "\n"+
                        "Step 2. Select Contract Booking\n" +
                                "\n"+
                        "Step 3. Choose booking type\n" +
                                "\n"+
                        "Step 4. Choose tracking type\n" +
                                "\n"+
                        "Step 5. Booking flow\n" +
                                "\n"+
                        "Step 6. Click on Submit.\n" +
                                "\n"+
                        "Step 7.  Select the vehicle from the drop down\n" +
                                "\n"+
                        "Step 8. Click on book now\n" +
                                "\n"+
                        "Note: Users can add multiple drops using the same vehicle. Our system supports the ability to schedule and manage multiple drop-off locations for a single vehicle"
            ),
        )
        val adapter = ExpandableListAdapter(this, groupList, childList)
        expandableListView.setAdapter(adapter)
    }

}




