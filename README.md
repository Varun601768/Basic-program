(.venv) PS D:\veg\veg> python app.py
D:\veg\veg\.venv\Lib\site-packages\sklearn\base.py:442: InconsistentVersionWarning: Trying to unpickle estimator OneHotEncoder from version 1.6.1 when using version 1.7.2. This might lead to breaking code or invalid results. Use at your own risk. For more info please refer to:
https://scikit-learn.org/stable/model_persistence.html#security-maintainability-limitations
  warnings.warn(
D:\veg\veg\.venv\Lib\site-packages\sklearn\base.py:442: InconsistentVersionWarning: Trying to unpickle estimator RobustScaler from version 1.6.1 when using version 1.7.2. This might lead to breaking code or invalid results. Use at your own risk. For more info please refer to:
https://scikit-learn.org/stable/model_persistence.html#security-maintainability-limitations
  warnings.warn(
Failed to load model: STACK_GLOBAL requires str    
Traceback (most recent call last):
  File "D:\veg\veg\app.py", line 246, in <module>  
    ensure_db()
  File "D:\veg\veg\app.py", line 45, in ensure_db  
    db.create_all()
  File "D:\veg\veg\.venv\Lib\site-packages\flask_sqlalchemy\extension.py", line 900, in create_all    
    self._call_for_binds(bind_key, "create_all")   
  File "D:\veg\veg\.venv\Lib\site-packages\flask_sqlalchemy\extension.py", line 871, in _call_for_binds
    engine = self.engines[key]
             ^^^^^^^^^^^^
  File "D:\veg\veg\.venv\Lib\site-packages\flask_sqlalchemy\extension.py", line 687, in engines       
    app = current_app._get_current_object()  # type: ignore[attr-defined]
          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        
  File "D:\veg\veg\.venv\Lib\site-packages\werkzeug\local.py", line 519, in _get_current_object       
    raise RuntimeError(unbound_message) from None  
RuntimeError: Working outside of application context.

This typically means that you attempted to use functionality that needed
the current application. To solve this, set up an application context
with app.app_context(). See the documentation for more information.
