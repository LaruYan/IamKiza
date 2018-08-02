package kr.LaruYan.iamkiza;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
        	//TODO 앱 정보에 대한 Dialog표시
				//설정 대화상자
				AlertDialog.Builder aboutDialogBuilder = new AlertDialog.Builder(this);//getApplicationContext());
				
				//Thread-safe 작업이 아닌건 아쉬워. 
				View dialogView = LayoutInflater.from(this).inflate(R.layout.dialogue_about, null);
				
				aboutDialogBuilder.setTitle(R.string.app_name);
				//preferenceDialog.setCancelable(false);//false: '뒤로' 버튼으로 닫을 수 없다.
				aboutDialogBuilder.setView(dialogView);
				aboutDialogBuilder.setIcon(R.drawable.ic_launcher);
				aboutDialogBuilder.create().show();
				
				return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

    	static final String EMPTY_STRING = "";
    	static final String DDAOMPYO_STRING = "\"";
		static final String DDAOMPYO_WITH_SPACE_STRING = "\" ";
		static final String COMMA_DIVIDED_STRING = ", ";
    	
    	//UI구성요소
    	EditText et_people;
    	EditText et_material;
    	EditText et_result;
    	
    	//반응 체크박스들
    	CheckBox cb_reaction_01;
    	CheckBox cb_reaction_02;
    	CheckBox cb_reaction_03;
    	CheckBox cb_reaction_04;
    	CheckBox cb_reaction_05;
    	CheckBox cb_reaction_06;
    	CheckBox cb_reaction_07;
    	CheckBox cb_reaction_08;
    	CheckBox cb_reaction_09;
    	CheckBox cb_reaction_10;
    	
    	//사용자지정 반응 체크박스들..
    	CheckBox cb_reaction_11;
    	CheckBox cb_reaction_12;
    	CheckBox cb_reaction_13;
    	CheckBox cb_reaction_14;
    	CheckBox cb_reaction_15;
    	CheckBox cb_reaction_16;
    	CheckBox cb_reaction_17;
    	CheckBox cb_reaction_18;
    	CheckBox cb_reaction_19;
    	CheckBox cb_reaction_20;
    	
    	final static String USER_REACTION_01 = "USER_REACTION_01";
    	final static String USER_REACTION_02 = "USER_REACTION_02";
    	final static String USER_REACTION_03 = "USER_REACTION_03";
    	final static String USER_REACTION_04 = "USER_REACTION_04";
    	final static String USER_REACTION_05 = "USER_REACTION_05";
    	final static String USER_REACTION_06 = "USER_REACTION_06";
    	final static String USER_REACTION_07 = "USER_REACTION_07";
    	final static String USER_REACTION_08 = "USER_REACTION_08";
    	final static String USER_REACTION_09 = "USER_REACTION_09";
    	final static String USER_REACTION_10 = "USER_REACTION_10";
    	
    	//사용자지정 반응 추가
    	EditText et_newReaction;
    	Button btn_addReaction;
    	
    	//송고 파트
    	Button btn_sendTo;
    	TextView tv_numChar;
    	
    	//사용자지정 반응 제거
    	Button btn_remove;
    	
    	//사용자지정 반응 저장소
    	SharedPreferences sharedPrefs;
    	
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            et_people = (EditText)rootView.findViewById(R.id.editText_people);
            et_material = (EditText)rootView.findViewById(R.id.editText_material);
            et_result = (EditText)rootView.findViewById(R.id.editText_result);
            
            cb_reaction_01 = (CheckBox)rootView.findViewById(R.id.checkBox_01);
            cb_reaction_02 = (CheckBox)rootView.findViewById(R.id.checkBox_02);
            cb_reaction_03 = (CheckBox)rootView.findViewById(R.id.checkBox_03);
            cb_reaction_04 = (CheckBox)rootView.findViewById(R.id.checkBox_04);
            cb_reaction_05 = (CheckBox)rootView.findViewById(R.id.checkBox_05);
            cb_reaction_06 = (CheckBox)rootView.findViewById(R.id.checkBox_06);
            cb_reaction_07 = (CheckBox)rootView.findViewById(R.id.checkBox_07);
            cb_reaction_08 = (CheckBox)rootView.findViewById(R.id.checkBox_08);
            cb_reaction_09 = (CheckBox)rootView.findViewById(R.id.checkBox_09);
            cb_reaction_10 = (CheckBox)rootView.findViewById(R.id.checkBox_10);
            
            cb_reaction_11 = (CheckBox)rootView.findViewById(R.id.checkBox_11);
            cb_reaction_12 = (CheckBox)rootView.findViewById(R.id.checkBox_12);
            cb_reaction_13 = (CheckBox)rootView.findViewById(R.id.checkBox_13);
            cb_reaction_14 = (CheckBox)rootView.findViewById(R.id.checkBox_14);
            cb_reaction_15 = (CheckBox)rootView.findViewById(R.id.checkBox_15);
            cb_reaction_16 = (CheckBox)rootView.findViewById(R.id.checkBox_16);
            cb_reaction_17 = (CheckBox)rootView.findViewById(R.id.checkBox_17);
            cb_reaction_18 = (CheckBox)rootView.findViewById(R.id.checkBox_18);
            cb_reaction_19 = (CheckBox)rootView.findViewById(R.id.checkBox_19);
            cb_reaction_20 = (CheckBox)rootView.findViewById(R.id.checkBox_20);
            
            et_newReaction = (EditText)rootView.findViewById(R.id.editText_newReaction);
            btn_addReaction = (Button)rootView.findViewById(R.id.button_addNewReaction);
            
            btn_sendTo = (Button)rootView.findViewById(R.id.button_sendto);
            tv_numChar = (TextView)rootView.findViewById(R.id.textView_numChar);
            
            btn_remove = (Button)rootView.findViewById(R.id.button_remove);
            		
            et_people.addTextChangedListener(new TextWatcher(){

				@Override
				public void afterTextChanged(Editable s) {
					printText();
				}

				@Override
				public void beforeTextChanged(CharSequence s, int start,
						int count, int after) {
				
				}

				@Override
				public void onTextChanged(CharSequence arg0, int start,
						int before, int count) {
					
				}});
            et_material.addTextChangedListener(new TextWatcher(){

				@Override
				public void afterTextChanged(Editable s) {
					printText();
				}

				@Override
				public void beforeTextChanged(CharSequence s, int start,
						int count, int after) {
				}

				@Override
				public void onTextChanged(CharSequence arg0, int start,
						int before, int count) {
				}});
            et_result.addTextChangedListener(new TextWatcher(){

				@Override
				public void afterTextChanged(Editable s) {
					if(s.length()>=1){
						btn_sendTo.setEnabled(true);
					}else{
						btn_sendTo.setEnabled(false);
					}
				}

				@Override
				public void beforeTextChanged(CharSequence s, int start,
						int count, int after) {
				}

				@Override
				public void onTextChanged(CharSequence s, int start,
						int before, int count) {
				}});
            
            cb_reaction_01.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_02.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_03.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_04.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_05.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_06.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_07.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_08.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_09.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_10.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            
            
            cb_reaction_11.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_12.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_13.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_14.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_15.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_16.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_17.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_18.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_19.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            cb_reaction_20.setOnCheckedChangeListener(new OnCheckedChangeListener () {

				@Override
				public void onCheckedChanged(CompoundButton view, boolean ischecked) {
					printText();
				}});
            
            loadPreference();
            
            et_newReaction.addTextChangedListener(new TextWatcher(){

				@Override
				public void afterTextChanged(Editable s) {
					if(s.length()>0){
						btn_addReaction.setEnabled(true);
					}else{
						btn_addReaction.setEnabled(false);
					}
				}

				@Override
				public void beforeTextChanged(CharSequence arg0, int arg1,
						int arg2, int arg3) {
				}

				@Override
				public void onTextChanged(CharSequence arg0, int arg1,
						int arg2, int arg3) {
				}});
            
            btn_addReaction.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
					SharedPreferences.Editor sharedPrefsEditor = sharedPrefs.edit();
					
					if(cb_reaction_11.getText().equals(EMPTY_STRING)){
						cb_reaction_11.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_01, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_11.setVisibility(View.VISIBLE);
					}else if(cb_reaction_12.getText().equals(EMPTY_STRING)){
						cb_reaction_12.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_02, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_12.setVisibility(View.VISIBLE);
					}else if(cb_reaction_13.getText().equals(EMPTY_STRING)){
						cb_reaction_13.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_03, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_13.setVisibility(View.VISIBLE);
					}else if(cb_reaction_14.getText().equals(EMPTY_STRING)){
						cb_reaction_14.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_04, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_14.setVisibility(View.VISIBLE);
					}else if(cb_reaction_15.getText().equals(EMPTY_STRING)){
						cb_reaction_15.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_05, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_15.setVisibility(View.VISIBLE);
					}else if(cb_reaction_16.getText().equals(EMPTY_STRING)){
						cb_reaction_16.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_06, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_16.setVisibility(View.VISIBLE);
					}else if(cb_reaction_17.getText().equals(EMPTY_STRING)){
						cb_reaction_17.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_07, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_17.setVisibility(View.VISIBLE);
					}else if(cb_reaction_18.getText().equals(EMPTY_STRING)){
						cb_reaction_18.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_08, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_18.setVisibility(View.VISIBLE);
					}else if(cb_reaction_19.getText().equals(EMPTY_STRING)){
						cb_reaction_19.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_09, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_19.setVisibility(View.VISIBLE);
					}else if(cb_reaction_20.getText().equals(EMPTY_STRING)){
						cb_reaction_20.setText(et_newReaction.getText()+EMPTY_STRING);
						sharedPrefsEditor.putString(USER_REACTION_10, et_newReaction.getText()+EMPTY_STRING);
						cb_reaction_20.setVisibility(View.VISIBLE);
					}else{
						Toast.makeText(getActivity(), R.string.err_full_slot, Toast.LENGTH_SHORT).show();
						sharedPrefsEditor.commit(); //make dummy commit
						return ;
					}
					
					
					//환경설정에 저장하도록!
					sharedPrefsEditor.commit();
					
					
					et_newReaction.setText(EMPTY_STRING);
				}});
            
            btn_sendTo.setOnClickListener(new OnClickListener(){

    			@Override
    			public void onClick(View v) {
    				Intent sendIntent = new Intent();
    				sendIntent.setAction(Intent.ACTION_SEND);
    				sendIntent.putExtra(Intent.EXTRA_TEXT, et_result.getText().toString());
    				sendIntent.setType("text/plain");
    				startActivity(sendIntent);
    			}});
            
            btn_remove.setOnLongClickListener(new OnLongClickListener(){

				@Override
				public boolean onLongClick(View v) {
					
					cb_reaction_11.setText(EMPTY_STRING);
					cb_reaction_11.setChecked(false);
					cb_reaction_11.setVisibility(View.GONE);
					cb_reaction_12.setText(EMPTY_STRING);
					cb_reaction_12.setChecked(false);
					cb_reaction_12.setVisibility(View.GONE);
					cb_reaction_13.setText(EMPTY_STRING);
					cb_reaction_13.setChecked(false);
					cb_reaction_13.setVisibility(View.GONE);
					cb_reaction_14.setText(EMPTY_STRING);
					cb_reaction_14.setChecked(false);
					cb_reaction_14.setVisibility(View.GONE);
					cb_reaction_15.setText(EMPTY_STRING);
					cb_reaction_15.setChecked(false);
					cb_reaction_15.setVisibility(View.GONE);
					cb_reaction_16.setText(EMPTY_STRING);
					cb_reaction_16.setChecked(false);
					cb_reaction_16.setVisibility(View.GONE);
					cb_reaction_17.setText(EMPTY_STRING);
					cb_reaction_17.setChecked(false);
					cb_reaction_17.setVisibility(View.GONE);
					cb_reaction_18.setText(EMPTY_STRING);
					cb_reaction_18.setChecked(false);
					cb_reaction_18.setVisibility(View.GONE);
					cb_reaction_19.setText(EMPTY_STRING);
					cb_reaction_19.setChecked(false);
					cb_reaction_19.setVisibility(View.GONE);
					cb_reaction_20.setText(EMPTY_STRING);
					cb_reaction_20.setChecked(false);
					cb_reaction_20.setVisibility(View.GONE);
					
					
					// 환경설정에서도 삭제
					sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
					SharedPreferences.Editor sharedPrefsEditor = sharedPrefs.edit();
					sharedPrefsEditor.putString(USER_REACTION_01, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_02, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_03, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_04, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_05, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_06, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_07, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_08, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_09, EMPTY_STRING);
					sharedPrefsEditor.putString(USER_REACTION_10, EMPTY_STRING);
					sharedPrefsEditor.commit();
					
					Toast.makeText(getActivity(), R.string.msg_removed, Toast.LENGTH_SHORT).show();
					
					return false;
				}});
            
            
            printText();
            return rootView;
        }
        private void printText(){
        	String result = getString(R.string.formatted_result,et_people.getText(),et_material.getText(),getReactions());
        	et_result.setText(result);
        	tv_numChar.setText(result.length()+EMPTY_STRING);
        }
        private String getReactions(){
        	
        	String result = EMPTY_STRING;
        	if(cb_reaction_01.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_01)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_02.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_02)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_03.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_03)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_04.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_04)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_05.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_05)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_06.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_06)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_07.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_07)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_08.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_08)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_09.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_09)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_10.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ getString(R.string.reaction_10)+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	
        	//사용자지정 슬롯
        	if(cb_reaction_11.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_11.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_12.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_12.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_13.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_13.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_14.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_14.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_15.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_15.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_16.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_16.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_17.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_17.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_18.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_18.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_19.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_19.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	if(cb_reaction_20.isChecked()){
        		result += DDAOMPYO_STRING+et_material.getText()+COMMA_DIVIDED_STRING+ cb_reaction_20.getText()+ DDAOMPYO_WITH_SPACE_STRING;
        	}
        	
        	
        	return result;
        }
        private void loadPreference(){
        	sharedPrefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        	
        	if(!sharedPrefs.getString(USER_REACTION_01,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_11.setText(sharedPrefs.getString(USER_REACTION_01,EMPTY_STRING));
        		cb_reaction_11.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_02,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_12.setText(sharedPrefs.getString(USER_REACTION_02,EMPTY_STRING));
        		cb_reaction_12.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_03,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_13.setText(sharedPrefs.getString(USER_REACTION_03,EMPTY_STRING));
        		cb_reaction_13.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_04,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_14.setText(sharedPrefs.getString(USER_REACTION_04,EMPTY_STRING));
        		cb_reaction_14.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_05,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_15.setText(sharedPrefs.getString(USER_REACTION_05,EMPTY_STRING));
        		cb_reaction_15.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_06,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_16.setText(sharedPrefs.getString(USER_REACTION_06,EMPTY_STRING));
        		cb_reaction_16.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_07,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_17.setText(sharedPrefs.getString(USER_REACTION_07,EMPTY_STRING));
        		cb_reaction_17.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_08,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_18.setText(sharedPrefs.getString(USER_REACTION_08,EMPTY_STRING));
        		cb_reaction_18.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_09,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_19.setText(sharedPrefs.getString(USER_REACTION_09,EMPTY_STRING));
        		cb_reaction_19.setVisibility(View.VISIBLE);
        	}
        	if(!sharedPrefs.getString(USER_REACTION_10,EMPTY_STRING).equals(EMPTY_STRING)){
        		cb_reaction_20.setText(sharedPrefs.getString(USER_REACTION_10,EMPTY_STRING));
        		cb_reaction_20.setVisibility(View.VISIBLE);
        	}
        }
    }

    
    
}
